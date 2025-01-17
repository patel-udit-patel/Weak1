import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int number = random.nextInt(1, 100);
        int guess;
        int count=0;
        System.out.println("Guess the number ");
        do {
            guess = input.nextInt();
            count++;
            if(guess>number){
                System.out.println("Guess is high ");
            }
            else if(guess<number){
                System.out.println("Guess is low");
            }
        } while (guess != number);
        System.out.println("You guessed the number in "+count+" counts");
    }
}
