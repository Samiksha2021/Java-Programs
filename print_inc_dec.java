public class print_inc_dec
{

     static void PDI(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        PDI(n-1);
        System.out.print(n+" ");

     }
    public static void main(String[] args)
    {
    int n =5;
    PDI(n);
    }
}




