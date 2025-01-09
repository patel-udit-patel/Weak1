import java.util.Scanner;
public class DistanceConverter {
    public static void main(String[] args) {
        //Using Scanner Object for user input
        Scanner input=new Scanner(System.in);

        //Taking distance in feets from user
        float distanceInFeets=input. nextFloat();

        //Calculating distance in yards
        float distanceInYards=distanceInFeets/3.0f;

        //Calculating distance in miles
        float distanceInMiles=distanceInYards/1760.0f;

        //printing distance in feet,yard and miles
        System.out.println("Distance In Feet "+distanceInFeets+" distanceInYards "+distanceInYards+ " distanceInMiles "+distanceInMiles);
    }
}
