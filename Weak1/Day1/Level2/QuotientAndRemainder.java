import java.util.Scanner;
public class QuotientAndRemainder{
    public static void main(String[]args){
        //using Scanner object for user input
        Scanner input=new Scanner(System.in);


        //Taking number1 from user as input
        int num1=input.nextInt();

         //Taking number2 from user as input
        int num2=input.nextInt();



        //printing Quotient and Reminder of num1 and num2
        System.out.println("The Quotient is "+ (num1/num2)+ "and Reminder is "+(num1%num2) "of two number"+ num1 + "and"+ num2);
    }
}
