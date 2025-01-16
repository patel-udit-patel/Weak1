import java.util.Scanner;
public class RemoveDuplicates{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a String");
		
		String word=new String();
		word=input.nextLine();
		
		String removeDuplicates=new String();
	
		for(int i=0;i<word.length();i++){
			boolean isNotPresent=true;
			for(int j=0;j<removeDuplicates.length();j++){
				if(word.charAt(i)==removeDuplicates.charAt(j)){
					isNotPresent=false;
				}
			}
			if(isNotPresent){
				removeDuplicates=removeDuplicates+word.charAt(i);
			}
		}

		System.out.println("String with removed duplicates is"+removeDuplicates);
	}
}
