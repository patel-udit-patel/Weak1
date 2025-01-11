import java.util.Scanner;
public class PowerOfNumber{
	public static void main(String[]args){

		//Use Scanner object for taking input from user
		Scanner input=new Scanner(System.in);

		//Taking number and power as input
		System.out.println("Input number ");
		int number=input.nextInt();

		System.out.println("Input Power ");
		int power=input.nextInt();
		int result=1;
		
		if(power>0){
			for(int i=1;i<power;i++){
				result=result*number;				
			}
			System.out.println(number+" to the power"+power+" is "+result);
				
		}
		else{
			System.out.println("power less than 1");
		}

	}
}