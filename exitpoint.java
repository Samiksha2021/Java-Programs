import java.util.Scanner;

public class exitpoint
 {

    static void exit(int a[][])
    {
        int dir=0,i=0,j=0;
        while(true)
        {
          dir =(dir+a[i][j])%4;
          if(dir==0){
            j++;
          }
          else if(dir==1){
            i++;
          }
          else if(dir==2){
             j--;
          }
          else if(dir==3){
            i--;
          }
          if(i<0)
          {
            i++;
            break;
          }
          else if(j<0){
            j++;
            break;
          }
          else if(i==a.length){
            i--;
            break;
          }
          else if(j==a[0].length){
            j--;
            break;
          }
        }
        System.out.print(i);
        System.out.print(",");
        System.out.print(j);

    }
    public static void main(String args[])
    {
           Scanner src= new Scanner(System.in);
         System.out.print("Enter the size of array: ");
          int a=src.nextInt();
         int b=src.nextInt();
        System.out.println("Enter the elements of array: ");
        int[][]arr= new int[a][b];
        for (int i=0;i<a;i++)
        {
           for (int j=0;j<b;j++)
           {
            arr[i][j]=src.nextInt();
           }
        }
        exit(arr);

    }
    
}
