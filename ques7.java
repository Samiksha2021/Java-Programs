import java.util.Scanner;
public class ques7 {
    
    public static void main(String[] args)
    {
       Scanner n =new Scanner(System.in);
       System.out.print("Enter first side: ");
       int a=n.nextInt();
       System.out.print("Enter second side: ");
       int b=n.nextInt();
       System.out.print("Enter third side: ");
       int c=n.nextInt();

       if(a+b>c && a+c>b && b+c>a){
        System.out.println("Triangle is valid.");
       }
       else{
        System.out.println("Triangle is not valid.");
       }
    }
}
