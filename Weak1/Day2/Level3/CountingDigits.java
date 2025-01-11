import java.util.Scanner;
public class CountingDigits{
	public static void main(String[]args){

		//Use Scanner object for taking input from user
		Scanner input=new Scanner(System.in);

		//Taking number as input
		System.out.println("Input number ");
		int number=input.nextInt();

		int result=0; 		// initialising result as 0
		while(temp!=0){		//looping till all digits
			int digit=number%10;
			result=result +1;
			number=number/10;
		}

		//Printing Count of all digits
		System.out.println("Number "+number+" has "+result+" digits ");
	} 
}