/*************Area and perimeter ************************* */
import java.util.*;
public class ques3
{
    public static void main(String args[])
    {
        Scanner n= new Scanner(System.in);
        System.out.print("Radius of circle: ");
        double radius= n.nextDouble();
        double perimeter= 2*3.14*radius;
        double area=3.14*radius*radius;
        System.out.println("Perimeter: "+perimeter);
        System.out.println("Area: "+area);
    }
    
}
