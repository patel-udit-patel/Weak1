import java.util.Scanner;
public class FizzBuzzWhile{
	public static void main(String[]args){

		//Use Scanner object for taking input from user
		Scanner input=new Scanner(System.in);

		//Taking number as input
		System.out.println("Input number ");
		int number=input.nextInt();
		
		int i=0; //initialising iterater
		while(i<=number){
			if(i%3==0&&i>2){
				System.out.print("Fizz");//checking if divisible by 3
			}
			else if(i%5==0&&i>4){
				System.out.print("Buzz");//checking if divisible by 5
			}
			else {
				System.out.print(i);
			}
			System.out.println();
			i++;  	//incrementing iterator
		}
		
	}
}	