import java.util.Scanner;

public class FactorialUsingRecursion {

    public static int factorial(int number){
        if(number==0||number==1)
            return 1;
        return number*factorial(number-1);
    }
    public static int takeNumber(){
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a number ");
        return input.nextInt();
    }
    public static void displayResult(int number,int result){
        System.out.println("The factorial of number "+number+" is "+result);
    }
    public static void main(String[]args){
        int number=takeNumber();
        int factorial=factorial( number);
        displayResult(number,factorial);
    }
}
