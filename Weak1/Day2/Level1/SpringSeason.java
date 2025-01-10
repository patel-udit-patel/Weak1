import java.util.Scanner;
public class SpringSeason{
	public static void main(String[]args){

		//Use Scanner object for taking input from user
		Scanner input=new Scanner(System.in);

		//Taking  day as input
		System.out.println("Input the day ");
		int day=input.nextInt();
		
		//Taking  month as input
		System.out.println("Input the month ");
		int month=input.nextInt();

		//Checking if the month is not between march and July so print not a Spring Season
		if(month>6 && month<3){
			System.out.println("Not a Spring Season");
		}
		
		//Otherwise Check if the day is in month march or July and 
		//if in march it should be greater than 20 
		//if in July it should be less than 20
		else{
			if(month==3 && day<20 || month==6 && day>20){
				System.out.println("Not a Spring Season");
			}

			//otherwise print its a spring season
			else{
				System.out.println("Its a Spring Season");
			}
		
		}
	}
}