import java.util.Scanner;



public class methneven {
    static void even() {

    System.out.println("enter the 'N' number:");
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    for( int i=1; i<=num; i++ ) { 
        if(i % 2 ==0){
        System.out.println(i);}
    }
    return ; }
    public static void main(String[] args) {
    even();
    }



    
}
