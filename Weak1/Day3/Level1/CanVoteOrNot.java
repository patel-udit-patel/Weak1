import java.util.*;

class CanVoteOrNot{
    public static void main(String[] args) {
        //Creating scanner class object for input
        Scanner input = new Scanner(System.in);
        //initializing an age array with length 10
        int[] age = new int[10];
        //taking input from user one by one.
        for (int i = 0; i < age.length; i++) {
            System.out.println("Enter age for : "+ (i+1));
            int inputAge = input.nextInt();
            if(inputAge<0){
                System.out.println("Invalid input ! ");
            }else{
                age[i]=inputAge;
            }

        }
        //iterating to each element to check condition of voting.
        for(int each : age){
            if(each>=18){
                System.out.println("The student with the age "+each+" can vote.");
            }else{
                System.out.println("The student with the age "+each+" cannot vote. ");
            }
        }

        //closing the scanner object.
        input.close();
    }
}