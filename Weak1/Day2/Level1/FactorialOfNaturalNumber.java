import java.util.Scanner;
public class FactorialOfNaturalNumber{
	public static void main(String[]args){

		//Use Scanner object for taking input from user
		Scanner input=new Scanner(System.in);
		
		//Initialising number and sum as double
		int number;
		int factorial=1;
		
		//Taking number as input
		System.out.println("Input the number ");
		number=input.nextInt();
		
		int i=number;
		//Checking if the number is natural
		if(i>0){
		//Use While loop till  zero
			while(number>0){
				//multiply number in factorial
				factorial=factorial*number;
				i=i-1;
		
			}
		
		//Display Total sum value is equal to total or not
		System.out.println("The factorial of "+number+" is"+factorial);

		}
		else{
			System.out.println(number+"Not a natural number");

		}
	}
}	