public class sum
{
static int add(int n){
    
    if(n==0){
        return 0;
    }
    int faith=add(n-1);
    return faith+n;

}

public static void main(String[] args)
{
    int n=5;
System.out.println(add(n));
}
}