import java.util.Scanner;
public class BasicCalculation{
	public static void main(String[]args){

		//Using Scanner Object for taking input from user
		Scanner input=new Scanner(System.in);
		System.out.println("Enter height in centimeters ");
		//Taking value of two numbers from User
		float number1=input.nextFloat();
		float number2=input.nextFloat();
		float addition=number1+number2;
		float subtraction=number1-number2;
		float multiplication=number1*number2;
		float division=number1/number2;
		
		//Printing addition, subtraction, multiplication and division value of 2 numbers
		System.out.println( "The addition, subtraction, multiplication and division value of 2 numbers"+ number1 +"and"+ number2 +  " is " + addition +" , "+ subtraction +","+ multiplication +"and " + division );
	

	}
}