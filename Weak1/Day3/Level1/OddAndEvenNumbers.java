import java.util.Scanner;

public class OddAndEvenNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //inititalizing the empty array of size 5
        int number=input.nextInt();
        if(number>0){
            int odd[] = new int[number/2+1];
            int even[] = new int[number/2+1];
            
            int index=0;
            for(int i=1;i<=number;i++){
                odd[index]=i;
                i++;
                even[index]=i;
            }
            System.out.println("Odd numbers ");
            for(int i=0;i<odd.length;i++){
                System.out.println(odd[i]);
            }
            System.out.println("Even numbers ");
            for(int i=0;i<even.length;i++){
                System.out.println(even[i]);
            }
        }
        else{
            System.out.println("Not a natural number");
        }
    }
}
