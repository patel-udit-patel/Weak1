import java.util.Scanner;
public class SwapTwoNumbers{
	public static void main(String[]args){
		//Use Scanner object for user input
		Scanner input=new Scanner(System.in);

		//declare number 1 and take input from user
		int number1=input.nextInt();

		//declare number 2 and take input from user
		int number2=input.nextInt();

		//declare a temporary variable for swapping
		int temp=0;

		//put value of number1 into temp
		temp=number1;

		//put value of number2 into number1
		number1=number2;

		//put value of temp into number2
		number2=temp;

		//Display swapped numbers
		System.out.println("The swapped numbers are"+number1+" and "+number2);
	}
}