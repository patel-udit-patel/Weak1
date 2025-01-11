import java.util.Scanner;
public class BodyMassIndex{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
	
	//initialise number of person
	System.out.println("Enter the number of  person ");
        int numberOfPerson=input.nextInt();

	//initialise weight,height BMI and weight status array of size number of person
        double[]weight=new double[numberOfPerson];
	double[]height=new double[numberOfPerson];
	double[]BMI=new double[numberOfPerson];
	String[]status=new String[numberOfPerson];

	//Storing weight and height in an arrays
	System.out.println("Enter the weight and height of a person ");
        for(int i=0;i<numberOfPerson;i++){
		weight[i]=input.nextDouble();
		height[i]=input.nextDouble();            
        }
	
	//Calculating weight and bodymassindex of each person
	for(int i=0;i<numberOfPerson ;i++){
		double bodyMassIndex=weight[i]/(height[i]*height[i]);
		BMI[i]=bodyMassIndex;

		if(bodyMassIndex<=18.4){
			status[i]="Underweight";
		}
		else if(bodyMassIndex<=24.9){
			status[i]="Normal";
		}
		else if(bodyMassIndex<=39.9){
			status[i]="Overweight";
		}
		else{
			status[i]="Obese";
		}
	}
	
	//Display the height, weight, BMI, and weight status of each person
	 for(int i=0;i<numberOfPerson;i++){
		System.out.println("Height "+height[i]+" Weight "+weight[i]+" BMI "+BMI[i]+" Status "+status[i]+" of"+i+"th person");
	}
    }
}
