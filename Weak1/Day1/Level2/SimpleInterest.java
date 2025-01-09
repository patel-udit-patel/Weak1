import java.util.Scanner;
public class SimpleInterest{
	public static void main(String[]args){
		//using Scanner object for user input
		Scanner input=new Scanner(System.in);

		//initialising principal amount 
		float principal=input.nextFloat();

		//initializing time 
		float time=input.nextFloat();

		//initalizing rate per interest
		float rate=input.nextFloat();
		
		//Calculating simple interest
		float simpleInterest=(principal*time*rate)/100;
				
		//Display simple interest as principal,rate and time
		System.out.println("The Simple Interest is "+simpleInterest+" for Principal "+  principal+", Rate of Interest "+rate+" and Time "+ time);
	
	}
}