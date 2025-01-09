import java.util.Scanner;
public class MaxNumberOfHandshakes {
    public static void main(String[] args) {
        //Using Scanner object for user input
        Scanner input =new Scanner(System.in);

        //Taking Number of students from users
        int numberOfStudents=input.nextInt();

        //Calculating maximum number of handshakes possible
        int maxNumberOfHandshakes=(numberOfStudents * (numberOfStudents - 1)) / 2;

        //Printing maximum number of handshakes possible
        System.out.println("Maximum number of handshakes possible "+maxNumberOfHandshakes);
    }
}
