import java.util.*;

class PrintMultiplicationTable2 {
    public static void main(String[] args) {
        //Creating input scanner class
        Scanner input = new Scanner(System.in);
        //taking input of number
        System.out.println("Enter number : ");
        int number = input.nextInt();
        //creating an array of size 10
        int table[] = new int[10];
        for (int i = 0; i < table.length; i++) {
            table[i]=number * (i+1);
        }
        //printing the each multiplication of number
        System.out.println("Printing Table : ");
        
        for (int i=5;i<10;i++) {
            System.out.println(number +" * "+ (i+1) +" = "+table[i]);
        }
        //closing the scanner object
        input.close();
    }
}
