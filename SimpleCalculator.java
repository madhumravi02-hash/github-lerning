import java.util.*;
public class SimpleCalculator {
    public static void main(String[]args){

        System.out.println(" enter the  value of a: ");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println(" enter the value of b: ");
        Scanner scc=new Scanner(System.in);
        int b= sc.nextInt();
        System.out.println(" enter the operned :");
        Scanner opp =new Scanner(System.in);
         char oppe = opp.next().charAt(0);

        switch (oppe) {
            case '*' :
                System.out.print(a * b);
                
                break;
        
                case '+' :
                System.out.print(a + b);
                
                break;
                case '-' :
                System.out.print(a - b);
                
                break;
                case '/' :
                System.out.print(a / b);
                
                break;
            default:
                System.out.println(" INVAILD INPUT ");
                break;
        }


    }
}
