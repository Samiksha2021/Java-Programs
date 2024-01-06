import java.util.Scanner;

public class selection_sort 
{
    static void sort(int a[])
     {
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                  int n=a[i];
                   a[i]=a[j];
                   a[j]=n;
                } 
            }
        }
        for(int i=0;i<a.length;i++)
                {
                    System.out.print(a[i]+" ");

                }
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
      
       
        sort(arr); 
    
     }
}
