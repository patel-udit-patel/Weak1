import java.util.Scanner;
public class CheckPalindrome{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a String");
		
		String word=new String();
		word=input.nextLine();

		boolean checkPalindrome=true; 
		for(int i=0;i<word.length()/2;i++){
			if(word.charAt(i)!=word.charAt(word.length()-1-i)){
				checkPalindrome=false;		
			}
		}
		System.out.println("Is the string Palindrome ? "+checkPalindrome);
	}
}