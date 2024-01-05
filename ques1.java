/***********Addition Subtraction Product and Division of two numbers********************** */
import java.util.Scanner;

public class ques1 
{
    public static void main(String args[])
    {
     Scanner read=new Scanner(System.in);
     System.out.print("Enter the first number: ");
     int num1=read.nextInt();
     System.out.print("Enter the second number: ");
     int num2=read.nextInt();
     int sum=num1+num2;
     int subtract=num1-num2;
     int product=num1*num2;
     int division=num1/num2;
     int mod=num1%num2;
     System.out.println(num1+ " + " +num2+ " = "+sum);
     System.out.println(num1+ " - " +num2+ " = " +subtract);
     System.out.println(num1+ " * " +num2+ " = "+product);
     System.out.println(num1+ " / " +num2+ " = " +division);
     System.out.println(num1+ " mod " +num2+ " = " +mod);
    }

    }