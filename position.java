import java.util.Scanner;
public class position 
{
    public static void main(String args[])
     {
        System.out.print("Enter the size of array:");
        Scanner n = new Scanner(System.in);
        int arr[] = new int[n.nextInt()];
        int i;
         System.out.print("Enter the elements of array:");
        for(i=0;i<arr.length;i++)
        {
            arr[i]= n.nextInt();
        }
        for(i=0;i<arr.length;i++)
        {
            if((i+1)%2==0)
            System.out.println("Even elements position: "+arr[i]);
            else{
                System.out.println("Odd position elements= "+arr[i]);
            }
        }
    }
}
       