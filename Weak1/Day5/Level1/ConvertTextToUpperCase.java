import java.util.*;
public class ConvertTextToUpperCase{

	//converts string to uppercase
	public static String toUpperCaseImp(String word){
		String result=new String();
		for(int i=0;i<word.length();i++){
			if(word.charAt(i)>='a' && word.charAt(i)<='z'){
				result=result+(char)(word.charAt(i)+('A'-'a'));
			}
			else{
				result=result+word.charAt(i);
			}
		}
		return result;
	}

	public static void main(String[] args){
		//Using Scanner object for user input
		Scanner input=new Scanner(System.in);

		//Taking input from user
		System.out.println("Enter a string");
		String word=new String();
		word=input.nextLine();
		
		//Calling method for comparison
		String result1=toUpperCaseImp(word);
		String result2=word.toUpperCase();

		//displaying results
		System.out.println("The result is "+result1+" and it is correct "+(result1.equals(result2)));
	}
}
