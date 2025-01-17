import java.util.Scanner;

public class TemperatureConverter {
    public static int fahrenheitToCelsius(int temperature){
       return temperature*9/5+32;
    }

    public static int celsiusToFahrenheit(int temperature){
        return (temperature-32)*5/9;
    }

    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit and Celsius");
        int temperatureInFahrenheit=input.nextInt();
        int temperatureInCelsius=input.nextInt();

        System.out.println("temperature in celsius "+fahrenheitToCelsius(temperatureInFahrenheit));
        System.out.println("temperature in fahrenheit "+celsiusToFahrenheit(temperatureInCelsius));
    }
}
