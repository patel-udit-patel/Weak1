import java.util.Scanner;
public class ConvertKilometersToMiles{
	public static void main(String[]args){

		//Initialising kilometer as km
		double km;

		//Using Scanner object for User input
		Scanner input=new Scanner(System.in);

		//Taking Input and assigning it to km
		km=input.nextDouble();
		
		//printing distance in kilometers and miles
		System.out.println("The total miles is "+km/1.6d+" mile for the given "+km+"km");
	}
}