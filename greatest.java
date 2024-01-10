import java.util.Scanner;

public class greatest {

    public static void main(String args[]){
        Scanner n = new Scanner (System.in);
         System.out.print("Enter first number: ");
        int a= n.nextInt();
        System.out.print("Enter second number: ");
         int b= n.nextInt();
         System.out.print("Enter third number: ");
       int c= n.nextInt();

       if(a>b && a>c){
        System.out.println( a + " is greatest");
       }
       else if(b>a && b>c){
       System.out.println( b + " is greatest");
       }
       else {
     System.out.println( c + " is greatest");

       }



    }
    
}
