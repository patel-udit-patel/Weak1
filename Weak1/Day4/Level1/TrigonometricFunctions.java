import java.util.Scanner;

public class TrigonometricFunctions {
    
    public static double[] calculateTrigonometricFunctions(double angle){
        double sine;
        double cosine;
        double tangent;

        double radian=(3.14/180)*angle;
        sine=Math.sin(radian);
        cosine=Math.cos(radian);
        tangent=Math.tan(radian);

        double[] sinCosTan=new double[3];
        sinCosTan[0]=sine;
        sinCosTan[1]=cosine;
        sinCosTan[2]=tangent;

        return sinCosTan;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter angle in degrees");
        double angle=input.nextDouble();

        double []sinCosTan=calculateTrigonometricFunctions(angle);

        System.out.println("The sine, cosine and tangent of angle "+angle+" are"+sinCosTan[0]+","+sinCosTan[1]+" and "+sinCosTan[2]);
    }
}

