import java.util.*;
public class NumberFormateExceptionDemonstration{

	//method for generate NumberFormateException
	public static void generateException(String word){
		
		System.out.println(Integer.parseInt(word));
	}

	//method to handle NumberFormateException
	public static void handleException(String word){
		try{
			System.out.println(Integer.parseInt(word));
		}
		catch(NumberFormatException e){
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

			//Using try catch block handling exceptions
		try{
			generateException(word);
		}
		catch(Exception e){
			System.out.println("Exception handled in main ");
		}

		handleException(word);
	}
}
