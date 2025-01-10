import java.util.Scanner;
public class LargestOfThree{
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
		boolean answer1=(number1>number2)&&(number1>number3);

		//Comparing number2 with both number1 and number3 and finding answer
		boolean answer2=(number2>number1)&&(number2>number3);

		//Comparing number3 with both number2 and number1 and finding answer
		boolean answer3=(number3>number2)&&(number3<number1);
	

		//Printing answers
		System.out.println("Is the first number Largest?"+answer1);
		System.out.println("Is the Second number Largest?"+answer2);
		System.out.println("Is the third number Largest?"+answer3);


	}
}