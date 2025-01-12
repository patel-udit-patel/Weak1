import java.util.*;
public class MaximumHandshakes {

    public static int maximumHandshakes(int numberOfStudents){
        int combination=(numberOfStudents*(numberOfStudents-1))/2;
        return combination;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter number of Students ");
        int numberOfStudents=input.nextInt();

        int maximumHandshakesPossible=maximumHandshakes(numberOfStudents);
        System.out.println("Maximum possible number of combination of handshakes "+maximumHandshakesPossible);
    }
    
}
