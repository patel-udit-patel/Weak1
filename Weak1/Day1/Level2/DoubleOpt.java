import java.util.Scanner;
public class DoubleOpt{
    public static void main(String[]args){
        //using Scanner object for user input
        Scanner input=new Scanner(System.in);


        //Taking number1 from user as input
        int a=input.nextDouble();

         //Taking number2 from user as input
        int b=input.nextDouble();
         
         //Taking number2 from user as input
        int c=input.nextDouble();

        //printing Quotient and Reminder of num1 and num2
        System.out.println("The results of Int Operations are "+(a+b*c)+ " "+(a*b+c)+" "+ (c+a/b) +"and"+ a%b+c);
    }
}