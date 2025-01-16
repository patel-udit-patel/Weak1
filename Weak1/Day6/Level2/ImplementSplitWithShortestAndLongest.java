import java.util.Scanner;
public class ImplementSplitWithShortestAndLongest{

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

	//method returns an array of words present in a string with their lengths
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
		//Using scanner object for user input
		Scanner input=new Scanner(System.in);
		
		//Taking input from user
		System.out.println("Enter the Sentense");
		String sentense=new String();
		sentense=input.nextLine();
		
		//calling method for split words
		String [][]strArray=implementSplit(sentense);
		
		//finding index of word with shortest and longest length
		int shortest=0,longest=0;
		for(int i=0;i<strArray[0].length;i++){
			if(Integer.parseInt(strArray[1][i])>Integer.parseInt(strArray[1][longest])){
				longest=i;	
			}		
			if(Integer.parseInt(strArray[1][i])<Integer.parseInt(strArray[1][longest])){
				shortest=i;	
			}
		}

		//Displaying longest and shortest length words
		System.out.println("longest "+strArray[0][longest]+" shortest"+strArray[0][shortest]);
	}
}