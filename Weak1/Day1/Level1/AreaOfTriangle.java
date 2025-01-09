import java.util.Scanner;
public class AreaOfTriangle{

	public static double areaOfTriangle(float base,float height){
		double area=((base*height)/2.0d);
		return area;
	}

	public static void main(String[]args){

		//Using Scanner Object for taking input from user
		Scanner input=new Scanner(System.in);
		System.out.println("Enter base of triangle ");
		//Taking value of two numbers from User
		float baseCM=input.nextFloat();
		float heightCM=input.nextFloat();

		//Converting base and height in inches
		float baseInches=baseCM/2.54f;
		float heightInches=heightCM/2.54f;

		//Converting base and height in feets
		float baseFeet= baseInches/12.0f;
		float heightFeet=heightInches/12.0f;

		double areaInCM=areaOfTriangle(baseCM,heightCM);
		double areaInInches=areaOfTriangle(baseInches,heightInches);
		double areaInFeets=areaOfTriangle(baseFeet,heightFeet);
		//Printing Area of tringle in cubic cm ,cubic inches and cubic feets
		System.out.println( "The area of triangle of base and height"+ baseCM +"and"+ heightCM +  " in cubic centimeter is " + areaInCM +" in cubic inches is "+ areaInInches +" in cubic feets is "+ areaInFeets);
	

	}
}