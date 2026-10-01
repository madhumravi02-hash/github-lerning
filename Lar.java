import java.util.Scanner;

public class Lar { 
    public static void main(String[]args){
    System.out.println(" enter the a value : ");
    Scanner sc=new Scanner(System.in);
    int A =sc.nextInt();
     System.out.println(" enter the b value : ");
    Scanner bc=new Scanner(System.in);
    int B =bc.nextInt();

    if(A>B) {
        System.out.println(" 'A' is Largest number  ");

    }
    else {
        System.out.println(" 'B' is Largest number  ");
    }
}
}
