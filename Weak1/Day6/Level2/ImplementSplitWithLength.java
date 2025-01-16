import java.util.Scanner;
public class ImplementSplitWithLength{

	//method returns length of string
	public static int findLengthOfString(String text){
		int length=0;
		try{
			while(true){
				text.charAt(length);
				length++;
			}

		}
		catch(Exception e){
			return length;
		}
	}

	//method returns number of words in a sentense
	public static int numberOfWords(String text){
		int count=1;
		int length=findLengthOfString(text);
		for(int i=0;i<length;i++){
			if(text.charAt(i)==' '){
				count++;
			}
		}
		return count;
	}

	//method returns the array of words present in sentense with their lengths
	public static String[][]implementSplit(String text){
		int numberOfWords=numberOfWords(text);
		int length=findLengthOfString(text);

		String [][]words=new String[2][numberOfWords];
		//int []spaces=new int[numberOfWords-1];
		String word=new String();
		word="";
		int index=0;
		int count=0;
		for(int i=0;i<length;i++){
			if(text.charAt(i)==' '){
				words[0][index]=word;
				words[1][index]=Integer.toString(count);
				count=0;
				index++;
				word="";
			}
			else{
			word=word+text.charAt(i);
			count++;
			}
		}
		words[0][index]=word;
		words[1][index]=Integer.toString(count);
		return words;
	}
		
	public static void main(String[]args){
		//Using Scanner object for user input
		Scanner input=new Scanner(System.in);
		
		//Taking input from user
		System.out.println("Enter the Sentense");
		String sentense=new String();
		sentense=input.nextLine();
		
		//Calling method for split words and their lengths
		String [][]strArray=implementSplit(sentense);
		//`String []str=sentense.split(" ");

		//Displaying words with their lengths
		for(int i=0;i<strArray[0].length;i++){
			System.out.println(strArray[0][i]+" "+strArray[1][i]);
		}
	}
}