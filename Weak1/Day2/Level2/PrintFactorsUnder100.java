import java.util.Scanner;
public class PrintFactorsUnder100{
	public static void main(String[]args){

		//Use Scanner object for taking input from user
		Scanner input=new Scanner(System.in);

		//Taking number as input
		System.out.println("Input number ");
		int number=input.nextInt();

		
		if(number>1){
			for(int i=100;i<0;i++){
				if(i%number==0){
					System.out.println(i);
				}
				
			}
				
		}
		else{
			System.out.println("Number less than 1");
		}

	}
}