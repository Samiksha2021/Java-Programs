public class log_power {


    static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int faith= power(x,n/2);
        int ans=faith*faith;
        if(n%2==1){
            ans= ans*x;
        }
        return ans;


    }
    public static void main(String[] args){
        int x=2;
        int n=9;
        System.out.println(power(x, n));
    }
    
}
