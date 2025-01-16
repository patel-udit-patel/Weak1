import java.util.Scanner;
public class RemoveCharacter{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a String");
		
		String sentence=new String();
		sentence=input.nextLine();
		
		System.out.println("Enter a Character to remove ");
		char toRemove=input.next();
		
		String result=new String();

		for(int i=0;i<sentence.length();i++){
			if(sentence.charAt(i)!=toRemove)
				result=result+sentence.charAt(i);
		}
		System.out.println("Modified String: "+result);

	}
}