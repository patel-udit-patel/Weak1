import java.util.Random;
import java.util.Scanner;
public class CanStudentVote {

    //Method generates random numbers as age 
    public static int[]randomAge(int number){
        //Using random object 
        Random random = new Random();
        int[] numbers = new int[number];

        // Generate 4-digit random numbers
        for (int i = 0; i < number; i++) {
            // Generates numbers from 10 to 99
            numbers[i] = 10 + random.nextInt(89); 
        }
        return numbers;
    }
    //method returns a 2d array to check if a person can vote
    public static int[][]canVote(int []age){
        int [][]canVote=new int[2][age.length];
        for(int i=0;i<age.length;i++){
            canVote[0][i]=age[i];
            if(age[i]<0)
                canVote[1][i]=-1;
            else if(age[i]>=18)
                canVote[1][i]=1;
            else
                canVote[1][i]=0;
        }
        return canVote;

    }
    public static void main(String[] args) {
        //Using scanner object for user input
        Scanner input=new Scanner(System.in);

        //Taking input from user
        System.out.println("Enter the number of Persons ");
        int number=input.nextInt();
        
        //Calling methods
        int []age=randomAge(number);
        int[][]canVote=canVote(age);

        //Displaying results
        for(int i=0;i<age.length;i++){
            System.out.println("the person with age "+canVote[0][i]+" can vote "+canVote[1][i]);
        }
    }
}
