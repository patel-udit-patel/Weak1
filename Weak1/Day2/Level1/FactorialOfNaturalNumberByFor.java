import java.util.Scanner;
public class FactorialOfNaturalNumberByFor{
	public static void main(String[]args){

		//Use Scanner object for taking input from user
		Scanner input=new Scanner(System.in);
		
		//Initialising number and sum as double
		int number;
		int factorial=1;
		
		//Taking number as input
		System.out.println("Input the number ");
		number=input.nextInt();
		
		//Checking if the number is natural
		if(number>0){
		//Use For loop till  zero
			for(int i=number;i>0;i--){
				//multiply number in factorial
				factorial=factorial*number;
		
			}
		
		//Display Total sum value is equal to total or not
		System.out.println("The factorial of "+number+" is"+factorial);

		}
		else{
			System.out.println(number+"Not a natural number");

		}
	}
}	