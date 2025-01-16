import java.util.Scanner;
public class CompareLexicographically{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a String");
		
		String word1=new String();
		word1=input.nextLine();
		
		String word2=new String();
		word2=input.nextLine();
		
		int i=0;
		while(word1.charAt(i)==word2.charAt(i)){
			if(i<word1.length()&& i<word2.length())
				break;
			i++;
		}
		if(word1.charAt(i)<word2.charAt(i)){
			System.out.println(word1+" comes before "+word2+" in lexicographical order");
		}
		else if(word2.charAt(i)<word1.charAt(i)){
			System.out.println(word2+" comes before "+word1+" in lexicographical order");

		}
		else{
			System.out.println(word2+" and "+word1+" are same in lexicographical order");

		}
	}
}

