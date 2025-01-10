import java.util.Scanner;
public class ReverseCounterForLoop{
	public static void main(String[]args){

		//Use Scanner object for taking input from user
		Scanner input=new Scanner(System.in);

		//Taking number as input
		System.out.println("Input the number ");
		int number=input.nextInt();

		//Use for loop till counter 1
		for(int i=number; i==1;i--){	
			//Print counter till 1
			System.out.println("Counter = "+number);

		}	
	}
}
