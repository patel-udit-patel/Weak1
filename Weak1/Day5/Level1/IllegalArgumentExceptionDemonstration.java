import java.util.*;
public class IllegalArgumentExceptionDemonstration{
	public static void generateException(String word){
		
		System.out.println(word.substring(word.length()-1,0));
	}

	public static void handleException(String word){
		try{
			System.out.println(word.substring(word.length()-1,0));
		}
		catch(Exception e){
			System.out.println("Exception handled in method ");
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
		catch(Exception e){
			System.out.println("Exception handled in main ");
		}

		handleException(word);
	}
}
