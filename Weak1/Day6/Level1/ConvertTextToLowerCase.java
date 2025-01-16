import java.util.*;
public class ConvertTextToLowerCase{

	//method converts string to lowercase
	public static String toLowerCaseImp(String word){
		String result=new String();
		for(int i=0;i<word.length();i++){
			if(word.charAt(i)>='A' && word.charAt(i)<='Z'){
				result=result+(char)(word.charAt(i)+('a'-'A'));
			}
			else{
				result=result+word.charAt(i);
			}
		}
		return result;
	}

	public static void main(String[] args){
	
		//Using scanner object for user input
		Scanner input=new Scanner(System.in);

		//Taking user input
		System.out.println("Enter a string");
		String word=new String();
		word=input.nextLine();
		
		//Calling methods for comparison
		String result1=toLowerCaseImp(word);
		String result2=word.toLowerCase();
		
		//displaying result
		System.out.println("The result is "+result1+" and it is correct ? "+(result1.equals(result2)));

	}
}
