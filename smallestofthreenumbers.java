import java.util.Scanner;

public class smallestofthreenumbers {
    static void largerest()  { 
    System.out.println("enter the 'A' value :");
    Scanner Asc=new Scanner(System.in);
    int A=Asc.nextInt();
    System.out.println("enter the 'B' value :");
    Scanner Bsc=new Scanner(System.in);
    int B=Asc.nextInt();
    System.out.println("enter the 'C' value :");
    Scanner Csc=new Scanner(System.in);
    int C=Asc.nextInt();
    if ( A<B && A<C ) {
        System.out.println(" 'A' value is smallest ");

    }
    else if ( B<A && B<C ) {
        System.out.println(" 'B' value is smallest ");

    }
    else {
        System.out.println(" 'C' value is smallest ");

    }
    return ;

    }
    public static void main(String[] args) {
        largerest();
    }
    
}
