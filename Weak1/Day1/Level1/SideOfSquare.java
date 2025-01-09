import java.util.Scanner;
public class SideOfSquare{
	public static void main(String[]args){
		//using Scanner object for user input
		Scanner input=new Scanner(System.in);

		//Taking perimeter from user as input
		float perimeter=input.nextFloat();

		//printing length of side and perimeter of square
		System.out.println("The length of the side is "+perimeter/4.0f+" whose perimeter is "+perimeter);
	}
}