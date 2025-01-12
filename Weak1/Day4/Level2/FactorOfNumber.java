import java.util.Scanner;
public class FactorOfNumber {
    public static int[]factorsOfNumber(int number){
        int maxFactor = 10;
        int[] factors = new int[maxFactor]; 
        int index = 0; 
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { 
                factors[index++] = i;
                if (index == maxFactor) {
                    maxFactor *= 2; 
                    int[] temp = new int[maxFactor]; 
                    for(int a=0;a<factors.length;a++){
                        temp[a]=factors[a];
                    }
                    factors = temp;
                }
            }
       }
       return factors;
   }
   //method returns sum of factors
   public static int sumOfFactor(int number){
       int sumOfFactor=0;
       int[]factor=factorsOfNumber(number);
       for(int i=0;i<factor.length;i++){
           sumOfFactor=sumOfFactor+factor[i];
       }
       return sumOfFactor;
   }
   //method returns product of factors
   public static int productOfFactor(int number){
       int productOfFactor=1;
       int[]factor=factorsOfNumber(number);
       for(int i=0;i<factor.length;i++){
           productOfFactor=productOfFactor*factor[i];
       }
       return productOfFactor;
   }
   //method returns square of factors in an array
   public static double[] squareOfFactors(int number){
       int[] factor=factorsOfNumber(number);
       int size=factor.length;
       double[] squareOfFactors=new double[size];
       for(int i=0; i<size ;i++){
           squareOfFactors[i]=Math.pow(factor[i],3);
       }
       return squareOfFactors;
   }

public static void main(String[] args) {
    //Using Scanner object for taking input
    Scanner input=new Scanner(System.in);
    
    //taking number as input
    System.out.println("Enter the number");
    int number=input.nextInt();

    //calling methods for result
    int[] factors=factorsOfNumber(number);
    int sumOfFactor=sumOfFactor(number);
    int productOfFactor=productOfFactor(number);
    double[] squareOfFactors=squareOfFactors(number);

    //Displaying result
    System.out.println("Factors of number"+number);
    for (int i=0; i <factors.length; i++) {
        System.out.println(factors[i]+",");
    }
    System.out.println("Cube of Factors of number "+number);
    for (int i=0; i <factors.length; i++) {
        System.out.println(squareOfFactors[i]+",");
    }
    System.out.println("Sum of Factors of number "+number+" is "+ sumOfFactor);
    System.out.println("Product of Factors of number "+number+" is "+ productOfFactor);

   }
}
