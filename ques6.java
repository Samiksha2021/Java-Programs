import java.util.Scanner;
public class ques6 {

    public static void main(String[] args)
    {
       Scanner n =new Scanner(System.in);
       System.out.print("Enter first angle: ");
       int a1=n.nextInt();
       System.out.print("Enter second angle: ");
       int a2=n.nextInt();
       System.out.print("Enter third angle: ");
       int a3=n.nextInt();
       int sum=a1+a2+a3;

       if(sum==180 && a1>0 && a2>0 && a3>0)
       {
        System.out.println("Triangle is valid");
       }
       else{
        System.out.println("Triangle is not valid");
       }

    }
    }

