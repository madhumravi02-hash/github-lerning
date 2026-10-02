import java.util.*;
public class MultiplicationTable {
    public static void main(String[]args){
         System.out.println(" enter the number ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
      
        for(int a= 1; a<=10; a++){
            int sum= num * a;
            System.out.println(sum);
        }
    }
    
}
