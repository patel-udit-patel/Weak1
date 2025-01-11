import java.util.Scanner;
public class BodyMassIndex{
	public static void main(String[]args){

		//Use Scanner object for taking input from user
		Scanner input=new Scanner(System.in);

		//Taking weight as input
		System.out.println("Input weight in kg ");
		double weight=input.nextDouble();

		//Taking weight as input
		System.out.println("Input height in cm ");
		double height=input.nextDouble();

		double heightInMetre=height/100; //converting height in cm to metre
		
		double bodyMassIndex=weight/(heightInMetre*heightInMetre);

		if(bodyMassIndex<=18.4){
			System.out.println("BMI "+bodyMassIndex+" Status  Underweight");
		}
		else if(bodyMassIndex<=24.9){
			System.out.println("BMI "+bodyMassIndex+" Status  Normal");
		}
		else if(bodyMassIndex<=39.9){
			System.out.println("BMI "+bodyMassIndex+" Status  Overweight");
		}
		else{
			System.out.println("BMI "+bodyMassIndex+" Status  Obese");
		}
		
				
	}
}	