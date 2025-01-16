import java.util.Scanner;
public class MostFrequentCharacter{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a String");
		
		String sentence=new String();
		sentence=input.nextLine();

		int[]freq=new int[256];
		for(int i=0;i<sentence.length();i++){
			freq[(int)(sentence.charAt(i))]++;
		}
		int maxFreq=-1;
		int index=-1;
		for(int i=0;i<256;i++){
			if(freq[i]>maxFreq){
				maxFreq=freq[i];
				index=i;
			}
		}
		System.out.println("Most Frequent Character : "+(char)(index));
	}
}
			
		
