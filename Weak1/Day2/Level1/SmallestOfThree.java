import java.util.Scanner;
public class SmallestOfThree{
	public static void main(String[]args){

		//Use Scanner object for taking input from user
		Scanner input=new Scanner(System.in);

		//Taking first number as input
		System.out.println("Input first number ");
		int number1=input.nextInt();
		
		//Taking second number as input
		System.out.println("Input Second number ");
		int number2=input.nextInt();
		
		//Taking third number as input
		System.out.println("Input third number ");
		int number3=input.nextInt();
		
		//Comparing number1 with both number2 and number3 and finding answer
		boolean answer=(number1<number2)&&(number1<number3);

		//Printing answer
		System.out.println("Is the first number smallest?"+answer);
	}
}