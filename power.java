public class power {

    static int linear(int x,int n){
        if(n==0){
            return 1;
        }
        int faith=linear(x,n-1);
        return faith*x;

    }
    public static void main(String[] args){
        int x=5;
        int n=3;
        System.out.println(linear(x,n));
    }
    
}
