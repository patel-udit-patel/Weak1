import java.util.Scanner;

public class SmallestAndLargest {
    public static int[] findSmallestAndLargest(int number1,int number2,int number3){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;

        if(number1>number2 && number1>number3){
            largest=number1;
        }
        else if(number2>number1 && number2>number3){
            largest=number2;
        }
        else{
            largest=number3;
        }

        if(number1<number2 && number1<number3){
            smallest=number1;
        }
        if(number2<number1 && number2<number3){
            smallest=number2;
        }
        else{
            smallest=number3;
        }
        int[]smallestAndLargest=new int[2];
        smallestAndLargest[0]=smallest;
        smallestAndLargest[1]=largest;

        return smallestAndLargest;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter three numbers ");
        int number1=input.nextInt();
        int number2=input.nextInt();
        int number3=input.nextInt();

        int[]smallestAndLargest=findSmallestAndLargest(number1, number2, number3);

        System.out.println("The smallest number is"+smallestAndLargest[0]+" The largest number is "+smallestAndLargest[1]);
    }
}
