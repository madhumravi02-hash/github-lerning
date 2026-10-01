import java.util.*;
public class Positive {
    public static void main(String[]args) {
        System.out.println(" enter the number:");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        if( num > 0) {
            System.out.println(" positive");
        }
        else if (num<0)
        {
            System.out.println(" Negitive ");
        }
        else 
        {
            System.out.println(" zero ");
        }
        

        //else {
            //System.out.println(" invaild input ");
        //}
 
    }
    
}
