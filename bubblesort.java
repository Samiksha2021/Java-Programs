import java.util.Scanner;

public class bubblesort 
{
      static void sort(int a[])
        {
            for(int i=0;i<a.length-1;i++)
            {
                int flag=0;
                for(int j=0;j<a.length-i-1;j++)
                {
                    if(a[j]>a[j+1])
                    {
                        int n=a[j];
                        a[j]=a[j+1];
                        a[j+1]=n;
                        flag=1;
                    }
                }
                 if(flag==0)
                {
                break;
                 }
            }
             for(int i=0;i<a.length;i++)
               {
                System.out.print(a[i]+" ");
               }
        }

    public static void main(String args[])
    {
      
        Scanner n= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size=n.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter the elements of array: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=n.nextInt();
        }
        sort(arr);
    }
    
}
