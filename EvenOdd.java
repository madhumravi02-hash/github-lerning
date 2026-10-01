import java.util.*;
public class EvenOdd {
    public static void main(String[]args){
        System.out.println(" enter the number: ");
        Scanner Scanner =new Scanner(System.in);
        int num =Scanner.nextInt();
        if(num % 2 ==0 ){
            System.out.println(" even ");
        }
        else  {
            System.out.println(" Odd ");
        }
    }
    
}
