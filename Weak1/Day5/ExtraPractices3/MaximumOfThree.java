import java.util.Scanner;
public class MaximumOfThree {
    public static int maximumOfThree(int number1,int number2,int number3){
        if(number1>number2&&number1>number3){
            return number1;
        }
        else if(number2>number1&&number2>number3){
            return number2;
        }
        else{
            return number3;
        }
    }
   public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the three numbers to compare");
        int number1=input.nextInt();
        int number2=input.nextInt();
        int number3=input.nextInt();

        System.out.println("The greater of three numbers is "+maximumOfThree(number1,number2,number3));
   }
}
