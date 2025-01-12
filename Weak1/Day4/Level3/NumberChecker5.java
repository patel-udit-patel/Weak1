import java.util.*;
public class NumberChecker5 {
    
    //method returns factors of a number in an array
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
    //method returns greatest factor of a number
    public static int greatestFactor(int number){
        int greatestFactor=1;
        int[]factor=factorsOfNumber(number);
        for(int i=0;i<factor.length;i++){
            if(factor[i]>greatestFactor){
                greatestFactor=factor[i];
            }
        }
        return greatestFactor;
    }
    //method retruns sum of factors of a number
    public static int sumOfFactor(int number){
        int sumOfFactor=0;
        int[]factor=factorsOfNumber(number);
        for(int i=0;i<factor.length;i++){
            sumOfFactor=sumOfFactor+factor[i];
        }
        return sumOfFactor;
    }
    //mehtod returns product of factors of number
    public static int productOfFactor(int number){
        int productOfFactor=1;
        int[]factor=factorsOfNumber(number);
        for(int i=0;i<factor.length;i++){
            productOfFactor=productOfFactor*factor[i];
        }
        return productOfFactor;
    }
    //method returns cube of all fators of number
    public static double[] cubeOfFactors(int number){
        int[] factor=factorsOfNumber(number);
        int size=factor.length;
        double[] cubeOfFactors=new double[size];
        for(int i=0; i<size ;i++){
            cubeOfFactors[i]=Math.pow(factor[i],3);
        }
        return cubeOfFactors;
    }
    //mehtod checks if a number is Perfect number
    public static boolean checkPerfect(int number){
        if(number<0){
            return false;
        }
        int sumOfDivisor=sumOfFactor(number);
        if(number==sumOfDivisor)
            return true;
        return false;
    }
    //method checks if a number is Abundant number
    public static boolean checkAbundant(int number){
        if(number<0){
            return false;
        }
        int sumOfDivisor=sumOfFactor(number);
        if(number<sumOfDivisor)
            return true;
        return false;
    }
    //mehtod checks if a number is deficient number
    public static boolean checkDeficient(int number){
        if(number<0){
            return false;
        }
        int sumOfDivisor=sumOfFactor(number);
        if(number>sumOfDivisor)
            return true;
        return false;
    }

    //method returns factorial of a number
    public static int factorial(int digit){
        int factorial=1;
        for(int i=1;i<=digit;i++){
            factorial=factorial*i+1
        }
        return factorial;
    }
    //method checks if a number is strong number
    public static boolean checkStrong(int number){
        if(number<0){
            return false;
        }
        int sumOfFactorialOfDigits=0;
        int temp=number;
        while(temp==0){
            int digit=temp%10;
            temp=temp/10;
            sumOfFactorialOfDigits=sumOfFactorialOfDigits+factorial(digit);
        }
        if(number==sumOfFactorialOfDigits)
            return true;
        return false;
    }
    public static void main(String[] args) {
        //Using scanner object for taking input
        Scanner input=new Scanner(System.in);
        
        //Taking number as input
        System.out.println("Enter the number");
        int number=input.nextInt();

        //calling methods for result
        int[] factors=factorsOfNumber(number);
        int sumOfFactor=sumOfFactor(number);
        int greatestFactor=greatestFactor(number);
        int productOfFactor=productOfFactor(number);
        double[] cubeOfFactors=cubeOfFactors(number);

        boolean checkPerfect=checkPerfect(number);	//calling of method countDigit
        boolean checkAbundant=checkAbundant(number);//calling of method mean
        boolean checkDeficient=checkDeficient(number);
        boolean checkStrong=checkStrong(number);

        //Displaying all results
        System.out.println("Factors of number"+number);
        for (int i=0; i <factors.length; i++) {
            System.out.println(factors[i]+",");
        }
        System.out.println("Cube of Factors of number "+number);
        for (int i=0; i <factors.length; i++) {
            System.out.println(cubeOfFactors[i]+",");
        }
        System.out.println("Greatest Factors of number "+number+" is "+ greatestFactor);
        System.out.println("Sum Factors of number "+number+" is "+ sumOfFactor);
        System.out.println("Greatest Factors of number "+number+" is "+ productOfFactor);

        System.out.println("The number is Perfect number ? "+checkPerfect);
        System.out.println("The number is Abundant number ? "+checkAbundant);
        System.out.println("The number is Deficient number ? "+checkDeficient);
        System.out.println("The number is Strong number ? "+checkStrong);
    
    }
}

