import java.util.*;
public class SmallestofTwoNumbersUsingTernary {
    public static void main(String[]args){
        System.out.println(" enter the value of a ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(" enter the value of b ");
        Scanner scc=new Scanner(System.in);
        int b=scc.nextInt();
        String results=(a>b)? " A IS GREATER ": " B IS  GREATER ";
        System.out.print(results);
        
    }
    
}
