import java.util.Scanner;
public class ToCharArray {
    
    public static char[]toCharArrayImplemented(String word){
        char[]array=new char[word.length()];
        for(int i=0;i<word.length();i++){
            array[i]=word.charAt(i);
        }
        return array;
    }
    public static boolean compareString(char[]word1,char[]word2){
        if(word1.length!=word2.length)
            return false;
        for(int i=0;i<word1.length;i++){
            if(word1[i]!=word2[i])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
		System.out.println("Enter a String");
		
		String sentence1=new String();
		sentence1=input.nextLine();

        char[]toCharArrayByImp=toCharArrayImplemented(sentence1);
        char[]toCharArrayByInBuilt=sentence1.toCharArray();

        boolean result=compareString(toCharArrayByImp,toCharArrayByInBuilt);

        System.out.println("The method to convert string to array is ?"+result);
    }
}
