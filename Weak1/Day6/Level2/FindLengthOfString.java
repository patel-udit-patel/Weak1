import java.util.Scanner;
public class FindLengthOfString{
		
	//method returns length of string
	public static int findLengthOfString(String text){
		int length=0;
		try{
			while(true){
				text.charAt(length);
				length++;
			}

		}catch(Exception e){
			return length;
		}
	}
	
	public static void main(String[]args){
		//Using scanner object for user input
		Scanner input=new Scanner(System.in);
	
		//Taking input from user
		System.out.println("Enter the string");
		String word=new String();
		word=input.nextLine();
	
		//Calling method for result
		int lengthOfString=findLengthOfString(word);

		//Displaying the length of string
		System.out.println("The length of string "+word+" is "+lengthOfString);
	}
}