import java.util.Scanner;
public class ques8 {
     public static void main(String[] args)
    {
       Scanner n =new Scanner(System.in);
       System.out.print("Enter first side: ");
       int a=n.nextInt();
       System.out.print("Enter second side: ");
       int b=n.nextInt();
       System.out.print("Enter third side: ");
       int c=n.nextInt();

       if(a==b && b==c){
        System.out.println("Equilateral Triangle");
       }
       else if(a==b || b==c || c==a){
        System.out.println("Isosceles triangle");
       }
       else{
        System.out.println("Scalene Triangle");
       }
    }
}

