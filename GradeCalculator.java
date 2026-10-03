import java.util.*;
public class GradeCalculator {
    public static void main(String[]args){
        System.out.println(" enter the marks of the student; ");
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        if(marks> 90){
            System.out.println(" YOUR GRADE IS: 'A' ");
        }
         else if(marks> 75){
            System.out.println(" YOUR GRADE IS: 'B' ");
        }
         else if(marks> 60){
            System.out.println(" YOUR GRADE IS: 'C' ");
        }
         else if(marks> 40){
            System.out.println(" YOUR GRADE IS: 'D' ");
        }
        else {
            System.out.println(" FAIL ");
        }
    }

    
}
