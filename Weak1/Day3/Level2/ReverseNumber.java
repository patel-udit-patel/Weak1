import java.util.Scanner;
public class ReverseNumber{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
	
	//initialise number
        int number=input.nextInt();

	//initialise digits array of size 10
        int[]digits=new int[10];

	//Storing digits in array
	System.out.println("Enter the number ");
        for(int i=0;i<10;i++){
            int digit=number%10;
            digits[i]=digit;
            number=number/10;
        }

	//Printing digits in reverse 
	System.out.println("The reversed number is ");
        for(int i=9;i>=0;i--){
            System.out.print(digits[i]);
        }
    }
}