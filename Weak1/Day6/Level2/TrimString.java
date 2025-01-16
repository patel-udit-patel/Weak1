import java.util.Scanner;
public class TrimString{

	//method returns a substring from start to end
	public static String createSubstring(String str ,int start,int end){
		String subStr=new String();
		for(int i=start;i<=end;i++){
			subStr=subStr+str.charAt(i);			
		}
		return subStr;
	}
	//method compares two strings and returns boolean value
	public static boolean compareString(String word1,String word2){
		if(word2.length()!=word1.length())
			return false;
		for(int i=0;i<word1.length();i++){
			if(word2.charAt(i)!=word1.charAt(i))
				return false;
		}
		return true;
	}
	//Method removes space from start and end of string 
	//and returns start and end index in an array
	public static int[]trimSpaces(String word){
		int start=0;
		int end=word.length()-1;
		for(int i=0;i<word.length()-1;i++){
			if(word.charAt(i)!=' '){
				break;
			}
			start++;
		}
		for(int i=end;i>=0;i--){
			if(word.charAt(i)!=' '){
				break;
			}
			end--;
		}
		return new int[]{start,end};
	}

	public static void main(String[]args){

		//Using scanner object for user input
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a String");
		
		//Taking input from user
		String sentence1=new String();
		sentence1=input.nextLine();
		
		//Calling method
		int[]trimSpace=new int[2];
		trimSpace=trimSpaces(sentence1);
		int start=trimSpace[0];
		int end=trimSpace[1];
		String check = createSubstring(sentence1,start,end);
		String checkByBuiltIn=sentence1.substring(start,end);
	
		boolean result= compareString(check,checkByBuiltIn);

		//Display result
		System.out.println("The both Strings are "+check+" and the result is "+result);
	}
}
