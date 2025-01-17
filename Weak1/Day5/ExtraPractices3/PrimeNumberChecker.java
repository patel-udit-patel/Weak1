import java.util.Scanner;
public class PrimeNumberChecker {

    public static boolean checkPrime(int number){
        int temp=number-1;
        while((temp)>1){
            if(number%temp==0) {
                return false;
            }
            temp--;
        }
        return true;
    }
    public  static void main(String[]args){
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a number");
        int number=input.nextInt();

        System.out.println("Is the number "+number+" is prime number ?"+checkPrime(number));
    }
}
