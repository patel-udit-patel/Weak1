
import java.util.Scanner;
public class TemperatureConversionOne{
	public static void main(String[]args){
		//Use Scanner object for user input
		Scanner input=new Scanner(System.in);

		//Create Celsius and take its value from user
		float celsius=input.nextFloat();
		
		//create farenheitResult and initialise with the result
		float farenheitResult=(celsius*9/5)+32;

		//print the temperature from Celsius into fahrenheit
		System.out.println(" The "+celsius+"Celsius is "+farenheitResult +" Fahrenheit");
	}
}