import java.util.Scanner;
public class DivisibilityCheck{
	public static void main(String[]args){
		//Use Scanner object for taking input from user
		Scanner input=new Scanner(System.in);

		//declare number of type integer
		int number;

		//Take input from user and initialize number
		number=input.nextInt();

		//Declare answer of type boolean and store the answer
		Boolean answer=(number%5==0);

		//Print the number and answer
		System.out.println("Is the number "+number+" divisible by 5? "+answer);
	}
}
		