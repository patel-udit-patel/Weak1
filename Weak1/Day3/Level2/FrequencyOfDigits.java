import java.util.*;
public class FrequencyOfDigits{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number=input.nextInt();

		int frequency[]=new int[10];

		int temp=number;
		while(temp!=0){
			int digit=temp%10;
			frequency[digit]++;
			temp=temp/10;
		}

		for(int i=0 ;i<10 ;i++){
			System.out.println(i+"is present "+frequency[i]+" times");
		}
		
	}
}