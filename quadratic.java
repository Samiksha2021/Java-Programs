import java.util.*;
public class quadratic {

    public static void main (String args[])
    {
        Scanner n= new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a= n.nextInt();
         System.out.print("Enter second number: ");
         int b= n.nextInt();
        System.out.print("Enter third number: ");
         int c= n.nextInt();

         double result = b*b - 4.0*a*c;

         if (result>0.0){
            double r1= (-b+ Math.pow(result,0.5))/(2.0*a);
            double r2= (-b- Math.pow(result, 0.5))/(2.0*a);
            System.out.println("The roots are "+ r1 + "and" + r2);
         }
         else if(result==0.0){
            double r= (-b/2.0 * a);
            System.out.println("The roots are "+ r);
         }
         else{
            System.out.println("The equation has no real roots");
         }

    }
}
