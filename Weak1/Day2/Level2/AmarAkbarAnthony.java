import java.util.Scanner;
public class AmarAkbarAnthony{
	public static void main(String[]args){

		//Use Scanner object for taking input from user
		Scanner input=new Scanner(System.in);

		//Taking age and height of three friends as input
		System.out.println("Input age and height of Amar ");
		int ageAmar=input.nextInt();
		int heightAmar=input.nextInt();

		System.out.println("Input age and height of Akbar  ");
		int ageAkbar=input.nextInt();
		int heightAkbar=input.nextInt();

		System.out.println("Input age and height of Anthony ");
		int ageAnthony=input.nextInt();
		int heightAnthony=input.nextInt();
	
		if(ageAmar<ageAkbar&&ageAmar<ageAnthony){
			System.out.println("The youngest among his friends is Amar");
		}
		else if(ageAmar>ageAkbar&&ageAkbar<ageAnthony){
			System.out.println("The youngest among his friends is Akbar");
		}
		else{
			System.out.println("The youngest among his friends Anthony");
		}
		
		if(heightAmar>heightAkbar&&heightAmar>heightAnthony){
			System.out.println("The Tallest among his friends is Amar");
		}
		
		else if(heightAkbar>heightAmar&&heightAkbar>heightAnthony){
			System.out.println("The Tallest among his friends is Akbar");
		}
		
		else{
			System.out.println("The Tallest among his friends is Anthony");
		}
	}
}

