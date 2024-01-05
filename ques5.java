import java.util.Scanner;

public class ques5 
{
    public static void main(String args[])
    {
        Scanner n= new Scanner(System.in);
        System.out.print("Length = ");
        int l= n.nextInt();
        System.out.print("Breadth = ");
        int b= n.nextInt();
        System.out.print("Height = ");
        int h= n.nextInt();
        int perimeter= 2*(l+b);
        int area= l*b*h;
        System.out.println("Perimeter = "+perimeter);
        System.out.println("Area = "+area);

        
    }
    
}
