import java.util.Scanner;
public class AbundantNumber{
	public static void main(String[]args){

		//Use Scanner object for taking input from user
		Scanner input=new Scanner(System.in);

		//Taking number as input
		System.out.println("Input number ");
		int number=input.nextInt();

		int sum=0;
		if(number>1){
			for(int i=1;i<number;i++){
				if(number%i==0){
					sum=sum+i;
				}
				
			}
		System.out.println(" Is Abundant "+(sum>number));
				
		}
		else{
			System.out.println("Number less than 1");
		}

	}
}