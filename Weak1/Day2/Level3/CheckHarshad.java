import java.util.Scanner;
public class CheckHarshad{
	public static void main(String[]args){

		//Use Scanner object for taking input from user
		Scanner input=new Scanner(System.in);

		//Taking number as input
		System.out.println("Input number ");
		int number=input.nextInt();

		int temp=number;	//initialising temporary variable with number
		int result=0; 		// initialising result as 0
		while(temp!=0){		//looping till all digits
			int digit=temp%10;
			result=result +digit;
			temp=temp/10;
		}

		boolean isHarshad=(number%result==0);		//Checking is Harshad

		//Printing Is Harshad
		System.out.println("Is the number"+number+"is Harshad Number ? "+isHarshad);
	} 
}