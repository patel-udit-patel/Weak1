import java.util.Scanner;
public class ChocolateAndChildren{
	public static void main(String[]args){
		//using Scanner object for user input
		Scanner input=new Scanner(System.in);

		//initialising number of chocolates
		int numberOfChocolates=input.nextInt();

		//initialising number of children
		int numberOfChildren=input.nextInt();
		
		//calculate number of chocolate per child
		int numberOfChocolatesPerChild=numberOfChocolates/ numberOfChildren;

		//calculate number of remaining chocolate after equal distribution
		int numberOfChocolatesRemaining=numberOfChocolates% numberOfChildren;	

		//Printing number of chocolate per child and number of remaining chocolate	
		System.out.println("The number of chocolates each child gets is "+numberOfChocolatesPerChild+" and the number of remaining chocolates are "+numberOfChocolatesRemaining);
	
	}
}