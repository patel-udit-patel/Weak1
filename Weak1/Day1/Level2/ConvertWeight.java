import java.util.Scanner;
public class ConvertWeight{
	public static void main(String[]args){
		//using Scanner object for user input
		Scanner input=new Scanner(System.in);

		//initialising weight in pounds and taking user input
		float weightInPound=input.nextFloat();
		
		//calculating weight in kilogram from weight in pounds
		float  weightInKilogram=weightInPound*2.2f;
				
		//Displaying weight in pound and weight in kilogram
		System.out.println("The weight of the person in pound is "+weightInPound+" and in kg is "+weightInKilogram);
	
	}
}