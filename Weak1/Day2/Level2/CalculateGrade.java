import java.util.Scanner;
public class CalculateGrade{
	public static void main(String[]args){

		//Use Scanner object for taking input from user
		Scanner input=new Scanner(System.in);

		//Taking physics marks as input
		System.out.println("Input marks in physics");
		int physics=input.nextInt();

		//Taking chemistry marks as input
		System.out.println("Input marks in chemistry");
		int chemistry=input.nextInt();

		//Taking maths marks  as input
		System.out.println("Input marks in maths ");
		int maths=input.nextInt();

		//Calculate percentage of marks in three subjects
		int percentage=(physics+chemistry+maths)/300;

		if(percentage>80){
			System.out.println("Average marks : "+percentage+" Grade : A  Remark : Level 4, above agency-normalised standards");
		}		
		else if(percentage>=70){
			System.out.println("Average marks : "+percentage+" Grade : B  Remark : Level 3, at agency-normalised standards");
		}
		else if(percentage>=60){
			System.out.println("Average marks : "+percentage+" Grade : C  Remark : Level 2, below,but approaching agency-normalised standards");
		}
		else if(percentage>=50){
			System.out.println("Average marks : "+percentage+" Grade : D  Remark : Level 1, well below agency-normalised standards");
		}
		else if(percentage>=40){
			System.out.println("Average marks : "+percentage+" Grade : E  Remark : Level 1, too agency-normalised standards");
		}
		else {
			System.out.println("Average marks : "+percentage+" Grade : R Remark : (Remedial standards)");
		}
				
	}
}