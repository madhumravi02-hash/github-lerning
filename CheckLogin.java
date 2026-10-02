import java.util.*;
public class CheckLogin {
    public static void main(String[]args){
     System.out.println(" enter the user name: ");
     Scanner sc= new Scanner(System.in);
     String usernamein=sc.nextLine();
     System.out.println(" enter the  password: ");
     Scanner ps= new Scanner(System.in);
     String passin=ps.nextLine();

     String username = " madhu_bmsce";
     String password = " madhu@bmsce123"; 
     if( username == usernamein && passin == password) {
        System.out.println("LOGIN");

     }
     else if (username != usernamein ||  passin != password) {
        System.out.println("err");
     }
     
    }
    
}
