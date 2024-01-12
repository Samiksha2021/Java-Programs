//WAP to print two digit number in array
import java.util.Scanner;
public class printArray 
{
    public static void main(String args[])
    {
        Scanner n= new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int arr[]= new int[n.nextInt()];
        System.out.print("Enter the elements of array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=n.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>9 && arr[i]<100)
            {
                System.out.print(arr[i]+ " ");
            }
            else{
                System.out.println();
            }
        }

    }   
}
