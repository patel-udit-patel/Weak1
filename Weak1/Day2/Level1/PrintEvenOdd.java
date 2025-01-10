import java.util.Scanner;
public class PrintEvenOdd{
	public static void main(String[]args){

		//Use Scanner object for taking input from user
		Scanner input=new Scanner(System.in);
		
		//Initialising number and sum as double
		int number;
		
		//Taking number as input
		System.out.println("Input the number ");
		number=input.nextInt();
		
		//Checking if the number is natural
		if(number>0){
		//Use For loop till number
			for(int i=1;i<=number;i++){
				System.out.println("Odd "+i+" Even "+(++i));
		
			}
		
		}
		else{
			System.out.println(number+"Not a natural number");

		}
	}
}	