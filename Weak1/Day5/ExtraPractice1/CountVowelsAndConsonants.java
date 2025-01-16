import java.util.Scanner;
public class CountVowelsAndConsonants{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a String");
		
		String word=new String();
		word=input.nextLine();
		
		int countVowel=0;
		int countConsonants=0;
		word=word.toLowerCase();
		for(int i=0;i<word.length();i++){
			if(word.charAt(i)>='a' && word.charAt(i)<='z'){
				if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u'){
					countVowel++;
				}
				else{
					countConsonants++;
				}
			}
		}
		System.out.println("Count of Vowel "countVowel+" Count of Consonants " +countConsonants);
	}
}