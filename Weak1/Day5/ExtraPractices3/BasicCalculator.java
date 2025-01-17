import java.util.Scanner;

public class BasicCalculator {
    public static double add(double a,double b){
        return a+b;
    }
    public static double subtract(double a,double b){
        return a-b;
    }
    public static double miltiply(double a,double b){
        return a*b;
    }
    public static double divide(double a,double b){
        return a/b;
    }

    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        System.out.println("Enter first number ");
        double number1=input.nextDouble();

        System.out.println("Enter second number");
        double number2= input.nextDouble();

        System.out.println("Enter operation");
        char operation=input.next().charAt(0);
        System.out.println("Answer is ");
        switch (operation){
            case '+':
                System.out.println(add(number1,number2));
                break;
            case '-':
                System.out.println(subtract(number1,number2));
                break;
            case '*':
                System.out.println(miltiply(number1,number2));
                break;
            case '/':
                System.out.println(divide(number1,number2));
                break;
            default:
                System.out.println("Invalid operation");

        }
    }
}
