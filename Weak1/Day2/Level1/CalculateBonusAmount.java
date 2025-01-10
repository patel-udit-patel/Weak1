import java.util.Scanner;
public class CalculateBonusAmount{
	public static void main(String[]args){

		//Use Scanner object for taking input from user
		Scanner input=new Scanner(System.in);
		
		//Initialising salary and bonus as integer
		int salary;
		int yearOfService;
		
		//Taking salary as input
		System.out.println("Input the Salary ");
		salary=input.nextInt();

		//Taking YearOfService as input
		System.out.println("Input the Years of service");
		yearOfService=input.nextInt();

		int bonus=0;
		
		if(yearOfService>5){
			bonus=salary*5/100;
		}
		System.out.println("The bonus amount for the "+salary+" is "+bonus);
	}
}	