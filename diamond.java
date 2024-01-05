public class diamond {

    public static void main(String args[])
     {
        int n=7;
        fulldiamond(n);
        System.out.println();
         hollowdiamond(n);
        reversehollow(n);
    }

    static void fulldiamond(int n)
    {
        int m=n;
        int row,col;
        
        for(row=1;row<=n-1;row++)
        {
            for(col=1;col<=n;col++)
            {
                if(col<m)
                {
                    System.out.print(" ");
                }
                else
                {
                   System.out.print("* ");
                }
            }
             m=m-1;
            System.out.println();                
        }         
        for(row=n;row<=2*n;row++)
        {
            for(col=1;col<=n;col++)
            {
                if(col<m)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("* ");
                }
            }
            m=m+1;
            System.out.println();
        }
    }  
    
    static void hollowdiamond(int n)
    {
        int m=n;
        int row,col;
        for(row=1;row<=n-1;row++)
        {
           
            for(col=1;col<=n;col++)
            {
                 if( col<m)
                {
                   System.out.print(" ");
                }  
                 else
                {
                  if(row>2 && row<n && col>m && col<n)
                {
                  System.out.print("  ");
                }
                  else
                {
                    System.out.print("* ");
                }
                }
            }
                m=m-1;
            System.out.println();
        }
    }
       static void reversehollow(int n)
       {

       int row,col;
       int m=1;
        for(row=1;row<=n;row++)
        {
           
            for(col=1;col<=n;col++)
            {
                 if( col<m)
                {
                   System.out.print(" ");
                }  
                 else
                {
                  if(row<1 || row<n && col>m && col<n)
                {
                  System.out.print("  ");
                }
                  else
                {
                    System.out.print("* ");
                }
                }
            }
              m=m+1;
              System.out.println();
        }
    }

}