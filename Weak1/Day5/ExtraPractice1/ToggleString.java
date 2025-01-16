import java.util.Scanner;
public class ToggleString{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a String");
		
		String sentence=new String();
		sentence=input.nextLine();
		
		String result=new String();

		for(int i=0;i<sentence.length();i++){
			if(sentence.charAt(i)>='A' && sentence.charAt(i)<='Z'){
				result=result+(char)(sentence.charAt(i)+'a'-'A');
			}
			else if(sentence.charAt(i)>='a' && sentence.charAt(i)<='z'){
				result=result+(char)(sentence.charAt(i)-'a'+'A');
			}
			else{
				result=result+sentence.charAt(i);
			}
		}
		System.out.println("The toggled String is "+result);
		
	}
}