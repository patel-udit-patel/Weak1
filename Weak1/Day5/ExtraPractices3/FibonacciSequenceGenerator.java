import java.util.Scanner;
public class FibonacciSequenceGenerator {
public  static void fibonacci(int n){
    int first=0;
    int second=1;
    if(n==1){
        System.out.print(first);
    }
    if(n>=2){
        System.out.print(first+" "+second);
    }
    for(int i=0;i<n-2;i++){
        System.out.print(" "+(first+second));
        int temp=first;
        first=second;
        second=second+temp;
    }
    System.out.println();
}
public static void main(String[]args){
    Scanner input=new Scanner(System.in);

    System.out.println("Enter number of terms");
    int number= input.nextInt();
    fibonacci(number);
}
}
