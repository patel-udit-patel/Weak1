import java.util.Scanner;

public class AthleteAndTriangle {
    public static int numberOfRounds(int perimeter){
        if(perimeter%5==0){
            return (perimeter/5);
        }
        return (perimeter/5 +1);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int side1=input.nextInt();
        int side2=input.nextInt();
        int side3=input.nextInt();

        int perimeter=side1+side2+side3;

        int numberOfRounds=numberOfRounds(perimeter);

        System.out.println("Athlete require "+numberOfRounds+" to complete 5km run ");
    
    }    
}
