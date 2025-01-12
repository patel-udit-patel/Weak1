import java.util.Scanner;

public class NumberChecker3 {

    //method for counting of digits
    public static int countDigit(int number){
		int count=0;
		while(number!=0){
			count++;
			number=number/10;
		}
		return count;
	}
    //method returns digits of number stored in array
    public static int[]digitInNumber(int number){
		int countDigit=countDigit(number);
		int []digits=new int[countDigit];
		int i=0;
		while(number!=0){
			digits[i]=number%10;
			number=number/10;
			i++;
		}
		return digits;
    }
    //method returns digits of number in reverse order in array
    public static int[]reverseDigits(int number){
		
		int []digits=digitInNumber(number);
        int size=digits.length;
        int []reverse=new int[size];
		for(int i=0;i<size;i++){
            reverse[i]=digits[size-i-1];
        }
		return reverse;
    }
    //method checks if a number is palindrome
    public static boolean checkPalindrome(int number){
        int []digits=digitInNumber(number);
        int []reverse=reverseDigits(number);
        for(int i=0;i<digits.length;i++){
            if(digits[i]!=reverse[i])
                return false;

        }
        return true;
    }
    //method checks if a number is duck number
    public static boolean checkDuck(int number){
        int []digits=digitInNumber(number);
        for(int i=0;i<digits.length;i++){
            if(digits[i]==0)
                return false;

        }
        return true;
    }

    public static void main(String[] args) {
        //using Scanner object for taking user input
        Scanner input=new Scanner(System.in);
        
        //taking number as input
        System.out.println("Enter the number");
        int number=input.nextInt();
    
        //calling methods for results
        int countOfDigits=countDigit(number);	//calling of method countDigit
        int[]digitInNumber=digitInNumber(number);//calling of method mean
        // int[]reverseDigits=reverseDigits(number);
        boolean checkPalindrome=checkPalindrome(number);
        boolean checkDuck=checkDuck(number);

        //Displaying results
        System.out.println("Count of digits is "+countOfDigits);

        System.out.println("Digits in number are ");
        for(int i=0;i<digitInNumber.length;i++){
            System.out.println(digitInNumber[i]);
        }

        System.out.println("The number is Duck  number ? "+checkDuck);

        System.out.println("The number is Palindrome number ? "+checkPalindrome);
    
    }
}
