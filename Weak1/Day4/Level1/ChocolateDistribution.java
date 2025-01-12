import java.util.Scanner;
public class ChocolateDistribution {

    public static int[] findRemainderAndQuotient(int number, int divisor){
        int[] remainderAndQuotient=new int[2];
        remainderAndQuotient[0]=number%divisor;
        remainderAndQuotient[1]=number/divisor;

        return remainderAndQuotient;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter  number of chocolate and number of children");
        int numberOfChildren=input.nextInt();
        int numberOfChocolate=input.nextInt();

        int[]remainderAndQuotient=findRemainderAndQuotient(numberOfChocolate, numberOfChildren);

        System.out.println("The number of chocolate a child get and number of chocolate left from"+numberOfChocolate+" chocolate  divided among "+numberOfChildren+" children are"+remainderAndQuotient[1]+" and "+remainderAndQuotient[0]);

    }
}
