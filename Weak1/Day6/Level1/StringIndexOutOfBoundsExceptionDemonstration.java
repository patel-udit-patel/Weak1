import java.util.*;
public class StringIndexOutOfBoundsExceptionDemonstration{

	//method generate exception
	public static void generateException(String word){
		System.out.println(word.charAt(word.length()));
	}

	//method handles exception by using try catch blocks
	public static void handleException(String word){
		try{
			System.out.println(word.charAt(word.length()));
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("Exception handled in method "+e);
		}
	}

	public static void main(String[]args){
		//Using Scanner object for user input
		Scanner input=new Scanner(System.in);

		//Taking input from user
		System.out.println("Enter a string");
		String word=new String();
		word=input.nextLine();

		//Handling exception by try catch block
		try{
			generateException(word);
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("Exception handled in main "+e);
		}

		handleException(word);
	}
}
