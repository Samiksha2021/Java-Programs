/*****************Print a multiplication table upto 10*************************8 */
import java.util.Scanner;

public class ques2 

{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=input.nextInt();

        for(int i=1;i<=10;i++)
        {
            int multiply=num*i;
            System.out.println(num+ " * "+i+ " = "+multiply);
        }

       
    }
}