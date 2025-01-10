import java.util.Scanner;
public class ReverseCounter{
	public static void main(String[]args){

		//Use Scanner object for taking input from user
		Scanner input=new Scanner(System.in);

		//Taking number as input
		System.out.println("Input the number ");
		int number=input.nextInt();

		//Use while loop till counter 1
		while(number==1){
			//Print counter till 1
			System.out.println("Counter = "+number);

			//Decrement counter  by 1
			number=number-1;
		}
	}
}
