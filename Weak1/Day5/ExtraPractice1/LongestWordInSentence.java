import java.util.Scanner;
public class LongestWordInSentence{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a String");
		
		String sentence=new String();
		sentence=input.nextLine();

		String word=new String();
		int maxLength=0;
		int len=0;
		for(int i=0;i<sentence.length();i++){
			String temp=new String();
		
			if(sentence.charAt(i)==' '){
				if(len>maxLength){
					maxLength=len;
					word=temp+" ";
					
				}
				temp="12";
				len=0;
			}
			else{
				temp=temp+sentence.charAt(i);
				len++;
			}
	
		}
		System.out.println("Longest word in a Sentence is "+word +"of length"+ maxLength);
	}
}
