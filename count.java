/***************No. of counts element present in array**********************/
import java.util.Scanner;
public class count {

    public static void main(String args[])
     {
        System.out.print("Enter the size of array:");
        Scanner n= new Scanner(System.in);
        int arr[]= new int [n.nextInt()]; 
        int i;
        System.out.print("Enter the elements of array :");
        for( i=0;i<arr.length;i++)
        {
            arr[i]=n.nextInt();
        }
        int j=0;
        for(int k=0;k<arr.length;k++)
        {
         int m= arr[j];
         int count=0;
         for(int s=0;s<arr.length;s++)
         {
            if(arr[s]==m)
            {
                 count++;
            } 
         }
         if(count>0)
         {
            System.out.println("Element:"+m + "="+count);
         }
         j++;
        }  
    }
    
}
