import java.util.Scanner;
public class ChillTemperature {
    
    //method returns windchill
    public static double calculateWindChill(double temperature, double windSpeed){
        double windChill;
        windChill=35.74+0.6215 * temperature +(0.4275 * temperature - 35.75)* Math.pow(windSpeed, 0.16);
        return windChill;
    }

    public static void main(String[] args) {
        //Using scanner object for user input
        Scanner input=new Scanner(System.in);

        //Taking temperature and windspeed as input
        System.out.println("Enter temperature and wind speed ");
        double temperature=input.nextDouble();
        double windSpeed=input.nextDouble();

        //Calculating and printing result
        double windChill=calculateWindChill(temperature,windSpeed);
         System.out.println("The wild chill at temperature"+temperature+" and "+windSpeed+" is "+windChill);

    }
}
