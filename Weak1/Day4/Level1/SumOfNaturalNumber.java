import java.util.Scanner;
public class SumOfNaturalNumber {
    
    //method returns sum of natural nubers till number
    public static int sumOfNaturalNumbers(int number){
        int sum=0;
        while(number>0){
            sum=sum+number;
            number=number-1;
        }
        return sum;
    }
    public static void main(String[] args) {
        //using Scanner object for user input
        Scanner input =new Scanner(System.in);
        
        //Taking number as input
        System.out.println("Enter the number");
        int number=input.nextInt();

        //Calculating sum
        int sumOfNaturalNumbers=sumOfNaturalNumbers(number);

        //Displaying result
        System.out.println("The sum of "+number+" natural number is"+sumOfNaturalNumbers);
    }
}
