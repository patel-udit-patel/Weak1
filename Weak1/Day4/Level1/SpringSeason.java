import java.util.Scanner;
public class SpringSeason {
    //method checks spring season
    public static boolean checkSpringSeason(int month,int day){
        if(month>6||month<3){
            return false;
        }
        else if((month==3 && day<20)||(month==6 && day>20) ){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        //using Scanner object for user input
        Scanner input= new Scanner(System.in);

        //taking day and month as inputs
        System.out.println("Enter day and month");
        int day=input.nextInt();
        int month=input.nextInt();

        //calling mehtod
        boolean checkSpringSeason=checkSpringSeason(month, day);

        //printing result
        if(checkSpringSeason){
            System.out.println("Its a Spring Season");
        }
        else{
            System.out.println("Not a Spring Season");
        }
    }
}
