import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;

public class PalindromeChecker {

    public static boolean checkPalindrome(String string){
        if(string.length()<2)
            return true;

        for(int i=0; i<string.length()/2;i++){
            if(string.charAt(i)!=string.charAt(string.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static String takeString(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string to check ");
        return input.nextLine();
    }

    public static void displayResult(boolean result){
        if(result){
            System.out.println("The given string is Palindrome");
        }
        else{
            System.out.println("The given string is not Palindrome ");
        }
    }
    public static void main(String[]args){
        String word=takeString();
        boolean checkPalindrome=checkPalindrome(word);
        displayResult(checkPalindrome);
    }
}
