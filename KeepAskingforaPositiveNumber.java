import java.util.*;
public class KeepAskingforaPositiveNumber {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int num;
        do{
    System.out.println(" enter the numbers: ");
    num=sc.nextInt();

        } while(num<=0);
         System.out.println(" positive  numbers: "+num);

    
    }
    
}
