import java.util.Scanner;
public class BodyMassIndex2DArray{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
	
	//initialise number of person
	System.out.println("Enter the number of  person ");
        int numberOfPerson=input.nextInt();

	//initialise weight,height BMI and weight status array of size number of person
        double[][]weightHeightBMI=new double[3][numberOfPerson];
	String[]status=new String[numberOfPerson];

	//Storing weight and height in an arrays
	System.out.println("Enter the weight and height of a person ");
	for(int field=0;field<3;field++){
        	for(int i=0;i<numberOfPerson;i++){
			weightHeightBMI[field][i]=input.nextDouble();
           
        	}
	}
	
	//Calculating weight and bodymassindex of each person
	for(int i=0;i<numberOfPerson ;i++){
		double bodyMassIndex=weightHeightBMI[0][i]/(weightHeightBMI[1][i]*weightHeightBMI[1][i]);
		weightHeightBMI[3][i]=bodyMassIndex;

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
		System.out.println("Height "+weightHeightBMI[1][i]+" Weight "+weightHeightBMI[0][i]+" BMI "+weightHeightBMI[3][i]+" Status "+status[i]+" of"+i+"th person");
	}
    }
}