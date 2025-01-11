import java.util.*;
public class FindBonus{
	public static void main(String[]args){
		//Use Scanner object for user input
		Scanner input=new Scanner(System.in);

		//Initialising double array for salary, yearOf Service,bonus and new salary
		double salary[]=new double[10];
		double yearOfService[]=new double[10];
		double bonus[]=new double[10];
		double newSalary[]=new double[10];
		
		//Taking salary and year of service of each employee from user
		for(int i=0;i<10;i++){
			System.out.println("Input the salary of"+(i+1)+"th employee");
			salary[i]=input.nextDouble();
			System.out.println("Input the year of service of"+(i+1)+"th employee");
			yearOfService[i]=input.nextDouble();
		}
		double totalBonus=0;
		double totalOldSalary=0;
		double totalNewSalary=0;
		
		//Calculating totalBonus, totalOldSalary, totalNewSalary
		for(int i=0;i<10;i++){
			if(yearOfService[i]>5){
				bonus[i]=salary[i]*5/100;
			}
			else {
				bonus[i]=salary[i]*2/100;
			}
			totalBonus=totalBonus+bonus[i];
			totalOldSalary=totalOldSalary+salary[i];
			newSalary[i]=salary[i]+bonus[i];
			totalNewSalary=totalNewSalary+newSalary[i];
		}

		//Printing totalBonus, totalOldSalary, totalNewSalary
		System.out.println("Total bonus "+ totalBonus+" Total old salary"+totalOldSalary+" Total new salary "+totalNewSalary);


	}
}			