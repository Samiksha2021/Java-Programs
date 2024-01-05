import java.util.Scanner;
public class sumofprime{
public static void main(String[] args)
{
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter the value of n: ");
    int n= sc.nextInt();
    int  sum = 0;   
for(int num = 1; num <= n; num++)  
{  
int count = 0;  
for (int i = 2; i <= num/2; i++)  
{       
if(num % i == 0)  
{  
count++;  
break;  
} 
} 
if(count == 0 && num!= 1 )  
{  
   
sum = sum + num;  
}   
}  
System.out.println("The Sum of Prime Numbers from 1 to n is: " + sum);   
}
}
