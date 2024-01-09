import java.util.*;
public class stairP {

    public static void main(String args[]){
        int n=4;
        ArrayList<String> collect= new ArrayList<>();
        getStair(n,"",collect);
        System.out.println(collect);
    }

    public static void getStair(int n, String ans, ArrayList<String> collect)
    {
        if(n<=0){
           if(n==0){
            collect.add(ans);
            return;
        }
       return;
        }
        getStair(n-1, ans+"1", collect);
        getStair(n-2, ans+"2", collect);
        getStair(n-3, ans+"3", collect);
    }    
}
