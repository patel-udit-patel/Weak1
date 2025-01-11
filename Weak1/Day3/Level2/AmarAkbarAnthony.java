import java.util.*;
public class AmarAkbarAnthony{
	public static void main(String[]args){

		//Use Scanner object for user input
		Scanner input=new Scanner(System.in);

		//initialise age and height array of size 3
		int age[]=new int[3];
		int height[]=new int[3];
	
		//Taking age and height of each friend from user
		for(int i=0 ;i<3 ;i++){
			System.out.println("Enter age and height of "+i+"th friend");
			age[i]=input.nextInt();
			height[i]=input.nextInt();
		}
		int youngest=Integer.MAX_VALUE;
		int tallest=Integer.MIN_VALUE;

		//Finding youngest and Tallest friend
		for(int i=0;i<3;i++){
			if(age[i]<youngest){
				youngest=age[i];
			}
			if (height[i]>tallest) {
				tallest=height[i];
			}
		}

		//Printing youngest and tallest
		System.out.println("the youngest and tallest of three friends are "+youngest+" and "+tallest);
	}
}