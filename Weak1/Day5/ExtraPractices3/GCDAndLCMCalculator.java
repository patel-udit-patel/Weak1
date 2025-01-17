import java.util.Scanner;

public class GCDAndLCMCalculator {
    public static int gcd(int a,int b){
        if(a==0)
            return b;
        if(b==0)
            return a;

        if(a>b){
            return gcd(a%b,b);
        }
        else{
            return gcd(a,b%a);
        }
    }
    public static int lcd(int a,int b){
        return a*b/gcd(a,b);
    }

    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        System.out.println("Enter two numbers ");
        int number1=input.nextInt();
        int number2=input.nextInt();

        System.out.println("The greatest common divisor is "+gcd(number1,number2));
        System.out.println("The lowest common multiple "+lcd(number1,number2));
    }
}
