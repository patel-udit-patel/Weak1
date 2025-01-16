import java.util.Scanner;
public class CountVowelAndConsonanats2D{
    public static String checkCharacterType(char c) {
        c = Character.toLowerCase(c);
        if (c >= 'a' && c <= 'z') {
            if ("aeiou".indexOf(c) != -1) {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    public static String[][] findVowelsAndConsonants(String input) {
        String[][] result = new String[input.length()][2];
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            result[i][0] = String.valueOf(c);
            result[i][1] = checkCharacterType(c);
        }
        return result;
    }

    public static void displayResults(String[][] data) {
        for (String[] row : data) {
            System.out.println( row[0]+"    "+row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = input.nextLine();

        String[][] results = findVowelsAndConsonants(word);
        displayResults(results);
    }
}
