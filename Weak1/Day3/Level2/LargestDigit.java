import java.util.Scanner;
public class LargestDigit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();

        int[]digits=new int[10];
        for(int i=0;i<10;i++){
            int digit=number%10;
            digits[i]=digit;
            number=number/10;
        }
        int largest=0, secondLargest=0;
        // Finding the largest element
        for (int i = 0; i <10; i++) {
            if (digits[i] > largest)
                largest = digits[i];
        }
        // Finding the second largest element
        for (int i = 0;i <10; i++) {
            //Update second largest if the current element is greater
            //than second largest and not equal to the largest
            if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        System.out.println("Largest and Second largest elements are "+largest+" and "+secondLargest);
    }
}
