import java.util.Scanner;
public class SumOfNaturalNumbers{
	public static void main(String[]args){

		//Use Scanner object for taking input from user
		Scanner input=new Scanner(System.in);

		//Taking  number as input
		System.out.println("Input the number ");
		int number=input.nextInt();
		
		//Check the number is natural if natural find sum and print
		if(number>0){
			int sumOfNumber=number*(number+1)/2;
			System.out.println("The sum of "+number+"natural number is "+sumOfNumber);
		}
		
		//Otherwise print not a natural number
		else{
			System.out.println("The number "+number +"is not a natural number");
		}

	}
}