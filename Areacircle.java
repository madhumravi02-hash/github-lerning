import java.util.Scanner;

public class Areacircle {
   static float area(float pi, float r) { 
    float sum= pi * r* r;
    return sum;
   }
    public static void main(String[]args){
        System.out.println(" enter the pi value: ");
        Scanner sc=new Scanner(System.in);
        float pi=sc.nextInt();
        System.out.println(" enter the r value: ");
        Scanner scc=new Scanner(System.in);
        float r=scc.nextInt();
        System.out.print(area(pi, r));
       
    }
    
}
