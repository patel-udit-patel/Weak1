import java.util.Scanner;
public class CountOccurrence{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a String");
		
		String sentence=new String();
		sentence=input.nextLine();
		
		String subString=new String();
		subString=input.nextLine();

		int count=0;
		for(int i=0;i<=sentence.length()-subString.length();i++){
			boolean isPresent=true;
			for(int j=0;j<subString.length();j++){
				if(subString.charAt(j)!=sentence.charAt(i+j)){
					isPresent=false;
				}
			}
			if(isPresent){
				count++;
			}
		}
		System.out.println("The given substring is occurred "+count+" times");
	}
}