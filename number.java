import java.util.Scanner;
public class number
 {

    public static void main(String args[])
    {
    Scanner n= new Scanner(System.in);
    System.out.println("Enter the number: ");
    int a = n.nextInt();

    if(a>0){
        System.out.println("Number is positive");
    }
    else if( a<0){
        System.out.println("Number is negative");
    }
    else if(a==0){
        System.out.println("Number is zero");
    }
   }


    
}
