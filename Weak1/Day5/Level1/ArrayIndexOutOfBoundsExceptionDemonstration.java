import java.util.*;
public class ArrayIndexOutOfBoundsExceptionDemonstration{

	//Generates ArrayIndexOutOfBoundsException
	public static void generateException(String[]array){
		
		System.out.println(array[array.length]);
	}
	

	//handles ArrayIndexOutOfBoundsException
	public static void handleException(String[]array){
		try{
			System.out.println(array[array.length]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception handled in method "+e);
		}
	}

	public static void main(String[]args){
		//Using scanner object for taking input
		Scanner input=new Scanner(System.in);

		//Taking number of names
		System.out.println("Enter number of  names ");
		int len=input.nextInt();
		
		//Taking all names in array
		System.out.println("Enter number of  names ");
		String[]names=new String[len];

		for(int i=0;i<len;i++){
			names[i]=input.next();
		}	

		//Using try catch block for handling exceptions	
		try{
			generateException(names);
		}
		catch(Exception e){
			System.out.println("Exception handled in main ");
		}

		handleException(names);
	}
}
