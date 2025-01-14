import java.util.Scanner;
public class CheckEquals{

	//method compares two strings and returns boolean
	public static boolean  checkEquals(String word1,String word2){
		if(word1.length()!=word2.length())
			return false;

		for(int i=0;i<word1.lenght();i++){+
			if(word1.charAt(i)!=word2.charAt(i))
				return false;
		}
		return true;
	}

	public static void main(String[]args){
		//Using scanner object for user input
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a String");
		
		//Initialising string1 and taking input
		String sentence1=new String();
		sentence1=input.nextLine();

		//Initialising string2 and taking input
		String sentence2=new String();
		sentence2=input.nextLine();
		
		//Calling methods
		boolean check = checkEquals(sentence1,sentence2);
		boolean checkByBuiltIn=sentence1.equals(sentence2);
	
		boolean result=(check==checkByBuiltIn);

		//displaying results
		System.out.println("The both Strings are "+check+" and the result is "+result);
	}
}
		


		
