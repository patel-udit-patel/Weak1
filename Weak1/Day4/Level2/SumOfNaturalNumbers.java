import java.util.Scanner;

public class SumOfNaturalNumbers {
    
    //method returns sum of all natural numbers till number
    public static int sumOfNaturalNumbers(int number){
        if(number==0){
            return 0;
        }
        return number+sumOfNaturalNumbers(number-1);
    }
    public static void main(String[] args) {
        //Using Scanner object for user input
        Scanner input =new Scanner(System.in);
        
        //Taking number as input
        System.out.println("Enter the number");
        int number=input.nextInt();

        //calling method 
        int sumOfNaturalNumbersByRecursion=sumOfNaturalNumbers(number);
        int sumOfNaturalNumbersByFormula=number*(number+1)/2;

        //Checking and displaying output
        System.out.println("The sum of "+number+" natural number is"+sumOfNaturalNumbers+" and result is "+(sumOfNaturalNumbersByFormula==sumOfNaturalNumbersByRecursion));
    }
}
