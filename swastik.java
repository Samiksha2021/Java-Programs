public class swastik {

    public static void main(String args[]) 
    {
        int n=5;
        p1(n);
        
    }

    static void p1(int n)
    {
        int row,col;
        for(row=1;row<=n;row++)
        {
            for(col=1;col<=n;col++)
            {
                if(row==(n/2)+1 || col== (n/2)+1|| row==1 && col>(n/2)+1 || row==n && col<=(n/2)+1  || col==1 && row<=(n/2)+1 || col==n && row >=(n/2)+1)
                System.out.print("* ");
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
