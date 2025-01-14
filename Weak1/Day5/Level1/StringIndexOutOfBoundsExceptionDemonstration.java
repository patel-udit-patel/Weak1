import java.util.*;
public class StringIndexOutOfBoundsExceptionDemonstration{
	public static void generateException(String word){
		
		System.out.println(word.charAt(word.length()));
	}

	public static void handleException(String word){
		try{
			System.out.println(word.charAt(word.length()));
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("Exception handled in method "+e);
		}
	}

	public static void main(String[]args){
		Scanner input=new Scanner(System.in);

		System.out.println("Enter a string");
		String word=new String();
		word=input.nextLine();

		
		
		try{
			generateException(word);
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("Exception handled in main "+e);
		}

		handleException(word);
	}
}
