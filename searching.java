/***************************Searching of element in array*****************************/
import java.util.Scanner;
public class searching
 {
    public static void main(String args[])
     {
         System.out.print("Enter the size of array : ");
        Scanner n =new Scanner(System.in); 
        int arr[]= new int[n.nextInt()];
        int i;
         System.out.print("Enter the elements of the array : ");
        for(i=0;i<arr.length;i++)
        {
           arr[i]= n.nextInt();
        }
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
            if(i<arr.length-1)
            {
                System.out.print(",");
            }
        }
        System.out.println();
        int count=0;
        System.out.print("Enter the number to be searched :");
        int k = n.nextInt();
        for( int j=0; j<arr.length;j++)
        {
            if(arr[j]==k)
            {
                count++;
            }

        }
        if(count>0)
        {
            System.out.println("ELement found");
            System.out.println("No. of availability: "+ count);
        }
        else
        {
            System.out.println("Element not found");
        }

        System.out.println();
    }     
}
