import java.util.Scanner;
public class GreatestFactor{
	public static void main(String[]args){

		//Use Scanner object for taking input from user
		Scanner input=new Scanner(System.in);

		//Taking number as input
		System.out.println("Input number ");
		int number=input.nextInt();

		int greatestFactor=1;
		
		if(number>1){
			for(int i=2;i<number;i++){
				if(number%i==0){
					greatestFactor=i;
				}
			}
			System.out.println("Is the number Prime ? "+greatestFactor);
				
		}
		else{
			System.out.println("Number less than 1");
		}

	}
}