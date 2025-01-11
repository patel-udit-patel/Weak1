import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        //Create a Scanner object to get user input
        Scanner input = new Scanner(System.in);

        //Input for first number
        System.out.print("Enter the first number: ");
        double first = input.nextDouble();

        //Input for second number
        System.out.print("Enter the second number: ");
        double second = input.nextDouble();

        //Input for operator
        System.out.print("Enter the operator (+, -, *, /): ");
        String op = input.next();

        // Perform the operation based on the operator using switch case
        switch (op) {
            case "+":
                System.out.println("Result: " + (first + second));
                break;
            case "-":
                System.out.println("Result: " + (first - second));
                break;
            case "*":
                System.out.println("Result: " + (first * second));
                break;
            case "/":
                // Handle division by zero
                if (second != 0) {
                    System.out.println("Result: " + (first / second));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                // If the operator is invalid
                System.out.println("Invalid Operator");
        }
    }
}
