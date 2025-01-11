import java.util.Scanner;

public class MeanHeightOfPlayers {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            //inititalizing the empty array of size 5
             double height[] = new double[11];
            for(int i=0;i<height.length;i++){
                System.out.println("Enter number "+(i+1));
                height[i] = input.nextDouble();
            }
            double sumOfAllElements=0;
            for(int i=0;i<height.length;i++){
                sumOfAllElements=sumOfAllElements+height[i];
            }
            double meanHeight=sumOfAllElements/height.length;
            System.out.println("Mean height of football team is"+meanHeight);
        }
}
