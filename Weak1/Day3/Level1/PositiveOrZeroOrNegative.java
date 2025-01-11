import java.util.*;

 class PositiveOrZeroOrNegative {
    public static void main(String[] args) {
        //Creating Scanner class object for input
        Scanner input = new Scanner(System.in);
        //inititalizing the empty array of size 5
        int number[] = new int[5];
        for(int i=0;i<number.length;i++){
            System.out.println("Enter number "+(i+1));
            number[i] = input.nextInt();
        }
        //checking the condition according to the number
        for(int each : number){
            if(each<0){
                System.out.println("The number "+each +" is Negative");
            }else if(each==0){
                System.out.println("The number "+each +" is Zero");
            }else{
                System.out.println("The number "+each +" is Positive");
            }
        }
        //closing the scanner object
        input.close();
    }
}