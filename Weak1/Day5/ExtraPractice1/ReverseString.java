import java.util.Scanner;
public class ReverseString{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a String");
		
		String word=new String();
		word=input.nextLine();
		
		String reversedString=new String();
		for(int i=word.length()-1;i>=0;i--){
			reversedString=reversedString+word.charAt(i);
		}
		System.out.println("Reversed string of word "+word+" is "+reversedString);
		
	}
}