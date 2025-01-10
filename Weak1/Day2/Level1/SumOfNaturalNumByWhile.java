import java.util.Scanner;
public class CheckSumOfNaturalNumByWhile{
	public static void main(String[]args){

		//Use Scanner object for taking input from user
		Scanner input=new Scanner(System.in);
		
		//Initialising number and sum as double
		double number;
		double sum=0;
		
		//Taking number as input
		System.out.println("Input the number ");
		number=input.nextDouble();
		
		double total=number*(number+1.0d)/2.0d;

		//Use while loop till user input zero
		while(number!=0.0){
			//add number in sum
			sum=sum+number;
		
			//decrement number by 1
			number=number-1;
		}
		
		boolean answer=sum==total;
		//Display Total sum value is equal to total or not
		System.out.println("Is Total Value is equal to sum by while loop? "+answer);
	}
}