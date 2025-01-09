import java.util.Scanner;
public class TotalPrice {
    
    public static void main(String[] args) {
        //Using Scanner Object for taking user input
        Scanner input=new Scanner(System.in);

        //Taking unit price of product from user
        System.out.println("Input the unit price");
        int unitPrice=input.nextInt();

        //Taking quantity of product from user
        System.out.println("Input the number of units ");
        int quantity=input.nextInt();

        //printing total price of all product
        System.out.println("The Total purchase price is INR"+unitPrice*quantity+"if the quantity "+quantity+" and unit price is "+unitPrice);
    }
}
