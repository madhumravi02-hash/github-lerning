import java.util.*;
public class Count {
    public static void main(String[]args){
          Scanner sc=new Scanner(System.in);
          int count=0;
          for (int i=0;i<10; i++) {
            System.out.println(" enter the numbers: ");
            int a=sc.nextInt();
            count++;
          }
          System.out.println(count);
    }
    
}
