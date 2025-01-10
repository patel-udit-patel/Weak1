import java.util.Scanner;
public class MultiplicationTable{
	public static void main(String[]args){

		//Use Scanner object for taking input from user
		Scanner input=new Scanner(System.in);
		
		//Initialising number 
		int number;
		
		//Taking number as input
		System.out.println("Input the number ");
		number=input.nextInt();
		
		//Use For loop till number and printing table
			for(int i=6;i<=9;i++){
				System.out.println(number+"*"+i+"= "+(i*number));
		
			}
		
		
	}
}	