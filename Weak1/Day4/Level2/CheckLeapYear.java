import java.util.Scanner;
public class CheckLeapYear{

	//method checks if year is leap year
	public static boolean checkLeapYear(int year){
		if(year>=1582){
			return false;
		}
		else{
			if((year%4==0&&year%100!=0)||year%400==0){
				return true;
			}
			else{
				return false;
			}
		}
	}
	}
	public static void main(String[]args){

		//Use Scanner object for taking input from user
		Scanner input=new Scanner(System.in);

		//Taking Year as input
		System.out.println("Input year ");
		int year=input.nextInt();

		Boolean isLeapYear=checkLeapYear(year);
		if(isLeapYear){
			System.out.println("Not a leap year ");
		}
		else{
			System.out.println("Leap Year");
		}
	}
