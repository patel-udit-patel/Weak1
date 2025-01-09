import java.util.Scanner;
public class DiscountedAmountUserInput{
	public static void main(String[]args){
		//Using Scanner object for taking input from user
		Scanner input=new Scanner(System.in);

		//Initialising fee 
		int fee=input.nextInt();

		//Initialising discount percentage
		int discountPercent=input.nextInt();

		//Calculating discount 
		int discount=fee*discountPercent/100;

		//Printing discount and discounted amount
		System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+(fee-discount));
	}
}

