import java.util.Scanner;
public class PrintQuotientAndRemainder {
    //returns remainder and quotien
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int[] remainderAndQuotient=new int[2];
        remainderAndQuotient[0]=number%divisor;
        remainderAndQuotient[1]=number/divisor;

        return remainderAndQuotient;
    }
    public static void main(String[] args) {
        //Using Scanner object for user input
        Scanner input=new Scanner(System.in);

        //taking number and divisor as input
        System.out.println("Enter  number and divisor");
        int number=input.nextInt();
        int divisor=input.nextInt();

        //storing result in array
        int[]remainderAndQuotient=findRemainderAndQuotient(number, divisor);

        //displaying result
        System.out.println("The quotient and remainder of number"+number+"is divided by divisor "+divisor+" are"+remainderAndQuotient[1]+" and "+remainderAndQuotient[0]);

    }
}
