import java.util.Scanner;
public class LeapYearTwo{
	public static void main(String[]args){

		//Use Scanner object for taking input from user
		Scanner input=new Scanner(System.in);

		//Taking Year as input
		System.out.println("Input year ");
		int year=input.nextInt();

		//Checking if the is valid year and leap year
		if(year>=1582&&(year%4==0&&year%100!=0)||year%400==0){
			System.out.println("Leap Year");
		}
	}
}