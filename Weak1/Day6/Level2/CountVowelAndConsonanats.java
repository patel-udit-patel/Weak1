import java.util.Scanner;
public class CountVowelAndConsonanats{
	
    //Method checks if a character is vowel consonant or another symbol
	public static String checkChar(char letter){
		if(letter>'A'&& letter<'Z')
			letter=(char)(letter+('a'-'A'));
		if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'){
			return "vowel";
		}else if(letter<='z'&&letter>='a'){
			return "consonant";
		}else{
			return "Not a Letter";
		}
    }
    //method counts the number of vowels and consonants and returns in an array
	public static int[] countVowelAndConsonants(String text){
        int countVowel=0;
        int countConsonants=0;
        for (int i = 0;i <text.length();i++) {
            if(checkChar(text.charAt(i))=="vowel"){
                countVowel++;
            }
            else if(checkChar(text.charAt(i))=="consonant"){
                countConsonants++;
            }
        }
        int[]array={countConsonants,countVowel};
        return array;
    }
	public static void main(String[]args){
        //Using Scanner object for user input 
		Scanner input=new Scanner(System.in);

        //Taking input from user
        System.out.println("Enter a text ");
        String text=new String();
        text=input.nextLine();

        //Calling method and displaying result
        int[]count=countVowelAndConsonants(text);
        System.out.println("The number of vowel and consonants are "+count[1]+" and "+count[0]);

    }
}
 