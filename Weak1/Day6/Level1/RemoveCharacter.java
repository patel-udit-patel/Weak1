import java.util.Scanner;
public class RemoveCharacter{

	public static boolean  checkEquals(String word1,String word2){
		if(word1.length()!=word2.length())
			return false;

		for(int i=0;i<word1.length();i++){
			if(word1.charAt(i)!=word2.charAt(i))
				return false;
		}
		return true;
	}

	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a String");
		
		String sentence1=new String();
		sentence1=input.nextLine();

		String sentence2=new String();
		sentence2=input.nextLine();
		
		boolean check = checkEquals(sentence1,sentence2);
		boolean checkByBuiltIn=sentence1.equals(sentence2);
		boolean result=(check==checkByBuiltIn);

		System.out.println("The both Strings are same ?"+check+" and the result is "+result);
	}
}
		


		
