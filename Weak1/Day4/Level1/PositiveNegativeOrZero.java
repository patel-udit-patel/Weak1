import java.util.Scanner;

public class PositiveNegativeOrZero {
    
    public static int checkNumber(int number){
        if(number>0)
            return 1;
        else if(number<0)
            return -1;

        return 0;
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Enter number");
        int number=input.nextInt();

        System.out.println("The number is"+checkNumber(number));
    }
}
