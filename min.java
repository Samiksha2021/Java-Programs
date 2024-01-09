//min element in an array

import java.util.Scanner;

public class min 
{
    static int minimum(int nums[])
    {
        int low=0;
        int high=nums.length;
        int ans=0;
        while(low<high)
        {
            int mid=low+high/2;
            int min=nums[0];
            
             if(nums[mid]>min)
            {
               return min;
            }
            else if(nums[mid]==min)
            {
                ans= mid;
                high=mid-1;
            }
           
            else{
                low=mid+1;
            }
        }
        return ans;
    }
     public static void main(String args[])
       {
         Scanner n = new Scanner(System.in);
          System.out.print("Enter the size of array: ");
          int size=n.nextInt();
          int arr[]= new int[size];
          System.out.print("Enter the elements of array: ");
          for(int i=0;i<arr.length;i++)
           {
             arr[i]=n.nextInt();
           }
           System.out.println((minimum(arr)));
        }
}
