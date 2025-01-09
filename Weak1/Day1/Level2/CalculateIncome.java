import java.util.Scanner;
public class CalculateIncome{
	public static void main(String[]args){
		//Use Scanner object to take input from user
		Scanner input=new Scanner(System.in);

		//Initialise salary and take input from user
		int salary=input.nextInt();

		//Initialise bonas and take input from user
		int bonus=input.nextInt();

		//Initialise and calculate Income
		int income=salary+bonus;

		//Print salary, bonus and income
		System.out.println("The salary is INR "+salary+" and bonus is INR "+bonus+".Hence Total Income is INR "+income);
	}
}