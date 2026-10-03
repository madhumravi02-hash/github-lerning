import java.util.Scanner;

public class SimpleMenu {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

System.out.println("*****MENU*****");
            System.out.println("1. TO SAY HELLO");
            System.out.println("2. TO SAY WELLCOME");
            System.out.println("3. TO EXIT");
            int num;
    
        do{
            System.out.println("enter the input");
            num=sc.nextInt();
            if(num==1){
               System.out.println("HELLO"); 
            }
            else if (num==2){
                System.out.println("WELLCOME");
            }
            else {
                System.out.println("invaild input ");
            }

            

        }while(num!=3);
        System.out.println("EXIT");

}
        

        }
    
    

