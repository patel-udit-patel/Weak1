import java.util.Random;
import java.util.Scanner;

public class PercentageCalculater {
    //returns an array of random marks for physics ,chemistry and math for each student
    public static int[][]randomMarks(int number){   
        Random random = new Random();
        int[][] numbers = new int[3][number];

        // Generate 2-digit random numbers
        for (int i = 0; i < number; i++) {
            // Generates numbers from 10 to 99
            numbers[0][i] = 10 + random.nextInt(89); 
            // Generates numbers from 10 to 99
            numbers[1][i] = 10 + random.nextInt(89); 
            // Generates numbers from 10 to 99
            numbers[2][i] = 10 + random.nextInt(89); 
       
        }
        return numbers;
    }
    //method returns an array of total marks ,average marks  and percentage of each student
    public static int[][] academics(int [][]marks){
        int [][]academics=new int[3][marks[0].length];
        for(int i=0;i<marks[0].length;i++){
            academics[0][i]=marks[0][i]+marks[1][i]+marks[2][i];
            academics[1][i]=Math.round(academics[0][i]/3);
            academics[2][i]=Math.round(academics[1][i]);
        }
        return academics;
    }
    //method returns an array of grades calculated by percentages of each students
    public static String[][] gradeCalculator(int[][]percentage){
        String[][]grade=new String[2][percentage[0].length];
        for(int i=0;i<percentage[0].length;i++){
            grade[0][i]=Integer.toString(percentage[2][i]);
            if(percentage[2][i]>79){
                grade[1][i]="A";
            }else if(percentage[2][i]>69){
                grade[1][i]="B";
            }else if(percentage[2][i]>59){
                grade[1][i]="C";
            }else if(percentage[2][i]>49){
                grade[1][i]="D";
            }else if(percentage[2][i]>39){
                grade[1][i]="E";
            }else{
                grade[1][i]="R";
            }
        }
        return grade;
    }
    public static void main(String[] args) {
        //Using scanner object for user input
        Scanner input=new Scanner(System.in);

        //taking number of students as input
        System.out.println("Enter the number of Students ");
        int number=input.nextInt();

        //obtaining random marks of students by calling methods
        int[][]marks=randomMarks(number);
        int [][]percentage=academics(marks);
        String[][]grades=gradeCalculator(percentage);

        //Displaying data in a table format
        System.out.println("S.no   Physics   Chemistry   Math     Total     Average     Percentages   Grades ");
        for(int i=0;i<number ;i++){
            System.out.println(i+1+"         "+marks[0][i]+"         "+marks[1][i]+"        "+marks[2][i]+"       "+percentage[0][i]+"      "+percentage[1][i]+"      "+percentage[2][i]+"          "+grades[1][i]);
        }

    }
}
