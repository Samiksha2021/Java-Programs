public class factorial {


    static int fact(int n){
        if (n==1){
            return 1;
        }
        int faith=fact(n-1);
        return faith*n;
    }

    public static void main(String[] args)
    {
        int n=3;
        System.out.println(fact(n));


    }
    
}
