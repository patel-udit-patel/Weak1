import java.util.Scanner;
public class LeapYear{
	public static void main(String[]args){

		//Use Scanner object for taking input from user
		Scanner input=new Scanner(System.in);

		//Taking Year as input
		System.out.println("Input year ");
		int year=input.nextInt();

		if(year>=1582){
			System.out.println("Invalid year entered");
		}
		else{
			if((year%4==0&&year%100!=0)||year%400==0){
				System.out.println("Leap Year");
			}
			else{
				System.out.println("not a Leap Year");

			}
		}
	}
}