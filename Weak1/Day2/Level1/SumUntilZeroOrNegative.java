import java.util.Scanner;
public class SumUntilZeroOrNegative{
	public static void main(String[]args){

		//Use Scanner object for taking input from user
		Scanner input=new Scanner(System.in);
		
		//Initialising number and sum as double
		double number;
		double sum=0;
		
		//Taking number as input
		System.out.println("Input the number ");
		number=input.nextDouble();

		//Use while loop till user input zero or negative
		while(number>0.0){
			//Taking number as input
			System.out.println("Input the number ");
			number=input.nextDouble();

			sum=sum+number;
		}
		
		//Display Total sum value
		System.out.println("Total Value "+sum);
	}
}