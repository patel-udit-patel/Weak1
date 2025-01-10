import java.util.Scanner;
public class CheckNumber{
	public static void main(String[]args){

		//Use Scanner object for taking input from user
		Scanner input=new Scanner(System.in);

		//Taking  number as input
		System.out.println("Input the number ");
		int number=input.nextInt();
		

		//ckeck if the number is greater than 0 if true print positive
		if(number>0){
			System.out.println("positive");
		}

		//check if the number if less than 0 if true print negative
		else if(number<0){
			System.out.println("negative");
		}

		//Otherwise Print zero
		else{
			System.out.println("zero");
		}
	}
}