import java.util.Scanner;
public class CreateSubstring{

	//method returns a substring from start to end
	public static String createSubstring(String str ,int start,int end){
		String subStr=new String();
		for(int i=start;i<=end;i++){
			subStr=subStr+str.charAt(i);			
		}
		return subStr;
	}

	public static void main(String[]args){

		//Using scanner object for user input
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a String");
		
		//Taking input from user
		String sentence1=new String();
		sentence1=input.nextLine();
		
		System.out.println("Enter a start and end index of string");
		int start=input.nextInt();
		int end=input.nextInt();

		//Calling method
		String check = createSubstring(sentence1,start,end);
		String checkByBuiltIn=sentence1.substring(start,end);
	
		boolean result=(check==checkByBuiltIn);

		//Display result
		System.out.println("The both Strings are "+check+" and the result is "+result);
	}
}
