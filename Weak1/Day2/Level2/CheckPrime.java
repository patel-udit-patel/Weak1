import java.util.Scanner;
public class CheckPrime{
	public static void main(String[]args){

		//Use Scanner object for taking input from user
		Scanner input=new Scanner(System.in);

		//Taking number as input
		System.out.println("Input number ");
		int number=input.nextInt();

		boolean result=true;
		
		if(number>1){
			for(int i=2;i<number;i++){
				if(number%i==0){
					result=false;
					break;
				}
			}
			System.out.println("Is the number Prime ? "+result);
				
		}
		else{
			System.out.println("Invalid Check");
		}

	}
}