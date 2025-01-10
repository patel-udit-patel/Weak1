import java.util.Scanner;
public class CanPersonVote{
	public static void main(String[]args){

		//Use Scanner object for taking input from user
		Scanner input=new Scanner(System.in);

		//Taking  age of person as input
		System.out.println("Input the Age of person ");
		int age=input.nextInt();

		//Cheking if the age is greater than 18 person can vote
		if(age>=18){
			System.out.println("The person's age is"+age+" and can vote");

		}
		//Otherwise print person cannot vote
		else{
			System.out.println("The person's age is"+age+"and cannot vote");
		}
	}
}
		
		