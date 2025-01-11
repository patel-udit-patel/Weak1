import java.util.Scanner;
public class LargestDigitTwo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

	System.out.println("Enter the number");//take input from user
        int number=input.nextInt();
	
	int maxDigit=10;
	int[]digits=new int[maxDigit];//initilise array for storing digits

	int index=0;
        for(int i=0;i<maxDigit;i++){
		if (index == maxDigit) {
                    maxDigit=maxDigit+10; 
                    int[] temp = new int[maxDigit]; // Create a new temporary array with additional 10  size

                    // copy existing digits into the new temporary array
                    for(int a=0;a<digits.length;a++){
			temp[a]=digits[a];
			}
			// assign the new larger array back to factors
                   	 digits = temp;
                }
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