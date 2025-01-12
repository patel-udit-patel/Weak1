import java.util.Scanner;
public class SimpleInterest{

	//Method returns simple interest for given arguments
	public static double simpleInterest(double principal ,double rate ,double time){
		double simpleInterest;
		simpleInterest=(principal*rate*time)/100;
		return simpleInterest;
	}

	public static void main(String[]args){
		//Use Scanner object for user input
		Scanner input=new Scanner(System.in);
		
		//initialised principal,rate and time and taken input from user
		System.out.println("Enter principal");
		double principal=input.nextDouble();
		
		System.out.println("Enter rate");
		double rate=input.nextDouble();

		System.out.println("Enter time");
		double time=input.nextDouble();

		//method call
		double simpleInterest=simpleInterest(principal,rate,time);

		//Print simple interest
		System.out.println("The Simple Interest is " + simpleInterest +" for Principal "+ principal +", Rate of Interest" + rate +" and Time"+time);
	}
}