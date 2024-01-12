//to find the sqrt of given no. with help of binary search

import java.util.Scanner;

public class sqrtOfNo 
{

    static int sqrt(int a)
    {
        if(a==0|| a==1)
        {
            return a;
        }
        int low=1;
        int high=a/2;
        int ans=0;

        while(low<=high)
        {
            int mid=(low+high)/2;
            if((long)mid*mid<=(long)a)
            {
                low=mid+1; 
                ans=mid; 
            }
            else{
                high=mid-1;
            }
        }
        return (int) ans;


    }
    public static void main(String args[])
    {
        Scanner n=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a= n.nextInt();

        System.out.println((sqrt(a)));

    }
    
}
