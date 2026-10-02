import java.util.*;
public class TernaryOperator {
    public static void main(String[]args){
        System.out.println(" enter the marks: ");
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        String results= (marks>40) ? "pass" : " fail ";
        System.out.print(results);
    }
    
}
