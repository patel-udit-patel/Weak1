import java.util.Scanner;
public class HeightConversion{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		float heightInCM=input.nextFloat();
		float heightInInches=heightInCM/2.54f;
		float heightInFeet=heightInInches/12;
		System.out.println("Your Height in cm is"+ heightInCM+" while in feet is " +heightInFeet+" and inches is"+ heightInInches);
	}
}