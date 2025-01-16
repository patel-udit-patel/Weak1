import java.util.Arrays;
import java.util.Scanner;
public class CheckAnargams{
    public static boolean checkAnargams(String str1, String str2){
        // If lengths are not equal, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }
        // Convertint strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sorting the character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Comparing sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }   
     public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
    }
}