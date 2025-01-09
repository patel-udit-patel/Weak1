import java.util.Scanner;
public class AthleteAndTriangle{
	public static void main(String[]args){
		//Use Scanner for User input
		Scanner input=new Scanner(System.in);
		
		//Initialise side one
		int side1=input.nextInt();
		
		//Initialise side two
		int side2=input.nextInt();
		
		//Initialise side three
		int side3=input.nextInt();
		
		//Calculate perimeter by sum of all three sides
		int perimeter=side1+side2+side3;

		//Calculate rounds
		int rounds=perimeter/5;
		if(perimeter%5!=0){
			rounds+1;	
		}
		System.out.println("The total number of rounds the athlete will run is"+ rounds +" to complete 5 km");
	
	}
}