

public class allhollowpattern 
{


    public static void main(String args[]) 
    {
         int n=5;
          
         p1(n);
         System.out.println();
         p2(n);
         System.out.println();
         p3(n);
         System.out.println();
         p4(n);
         System.out.println();
         p5(n);
         System.out.println();
         p6(n);
         System.out.println();
         p7(n);
         System.out.println();
         p8(n);
         System.out.println();
         p9(n);
         System.out.println();
         p10(n);
          System.out.println();
           p11(n);
        //  System.out.println();
    }


         static void p1(int n)
    {
            int row,col;
         for(row=1;row<=n;row++)
         {
            for(col=1;col<=n;col++)
            {
                if(col==1 || col==n)
                {
                     System.out.print("* ");
                }
                else
                { 
                    System.out.print("  ");

                }
                
            }
            System.out.println();
         }
    }

    static void p2(int n)
    {
        int row,col;
         for(row=1;row<=n;row++)
         {
            for(col=1;col<=n;col++)
            {
                if(row==1 || row==n)
                {
                     System.out.print("* ");
                }
                else
                { 
                    System.out.print("  ");

                }
                
            }
            System.out.println();
         }

    }

    static void p3(int n)
    {
        int row,col;
         for(row=1;row<=n;row++)
        {
            for(col=1;col<=n;col++)
            {
                if(col==1 || col==n || row==1 || row==n)
                {
                     System.out.print("* ");
                }
                else
                { 
                    System.out.print("  ");

                }
                
            }
            System.out.println();
         }
    }

    static void p4(int n)
    {
        int row,col;
        for(row=1;row<=n;row++)
       {
            for(col=1;col<=n;col++)
            {
                if(row==col || row + col==n+1)
                {
                     System.out.print("* ");
                }
                else
                { 
                    System.out.print("  ");

                }
                
            }
            System.out.println();
         }

    }

    static void p5(int n)
    {
        int row,col;
        for(row=1;row<=n;row++)
         {
            for(col=1;col<=n;col++)
            {
                if(col==1 || row==col || row==n )
                {
                     System.out.print("* ");
                }
                else
                { 
                    System.out.print("  ");

                }
                
            }
            System.out.println();
         }
    }

    static void p6(int n)
    {
        int row,col;
        for(row=1;row<=n;row++)
         {
            for(col=1;col<=n;col++)
            {
                if(col==n || row + col==n+1 ||  row==n)
                {
                     System.out.print("* ");
                }
                else
                { 
                    System.out.print("  ");

                }
                
            }
            System.out.println();
         }
    }
      /************************************** hollow hilll*********************************************/
     static void p7(int n)
     {
        int row,col;
        for(row=1;row<=n;row++)
        {
             for (col=row;col<=n;col++)
            {
                System.out.print("  ");
            }
            for(col=1;col<row;col++)
            {
                if(row==n || row==col || col==1)
                 System.out.print("* ");
               else{
                 System.out.print("  ");
                }
            }
             for (col=1;col<=row;col++)
            {
                if(col==row|| row==n || row +col==2*n+1 )
                {
                    System.out.print("* ");
                
                }
                else
                {
                    System.out.print("  ");

                 }
                
            }
            System.out.println();
        }
     } 

    /***************************************plus sign****************************************** */

     static void p8(int n)
     {
        int row,col;
       
        for(row=1;row<n;row++)
        {
            for(col=1;col<n;col++)
            {
                if( row==(n/2) || col==(n/2))
                {
                    System.out.print("* "); 
                }
                else
                {
                     System.out.print("  ");

                }
               
            }
            System.out.println();
        }

     }
     /*******************************hollow sand glass*********************************** */

     static void p9(int n)
     {

           int row,col;
         for(row=1;row<=n;row++)
         {
            for(col=1;col<=n;col++)
            {
                if(col==n || row + col==n+1 ||  row==n)
                {
                     System.out.print("* ");
                }
                else
                { 
                    System.out.print("  ");

                }
                
            }
            System.out.println();
         }
    }
    
    /****************************************Swastik****************************************** */

    static void p10(int n)
    {
              int row,col;
         for(row=1;row<=n;row++)
         {
            for(col=1;col<=n;col++)
            {
                if(  col==(n/2)+1 || row==(n/2)+1|| col==1 && row<=(n/2)+1 || row>=(n/2)+1 && row==(n-1) && col<=(n/2)+1  || row<(n/2)+1 && row==1 && col>(n/2)+1 || col>(n/2)+1 && col==n-1 && row>(n/2)+1) 
                {
                     System.out.print("* ");
                }
                else
                { 
                    System.out.print("  ");

                }
                
            }
            System.out.println();
         }
    }
    /**********************************diamond*********************************** */

     static void p11(int n)
    {
        int row,col;
         for(row=1;row<=n-1;row++)
        {
            for(col=row;col<=n;col++)
            {
                System.out.print(" ");
            }
            for(col=1;col<=row;col++)
            {
                if(col==1 || row==n || col==n  )
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");

                }
                
            }

            System.out.println();
         }
         for(row=1;row<=n;row++)
         {
            for(col=1;col<=row;col++)
            {
                System.out.print(" ");
            }
            for(col=row;col<=n;col++)
            {
                if(col==row|| row==n || row +col==2*n+1 )
                {
                    System.out.print("* "); 
                }
                else
                {
                    System.out.print(" ");
            }

                }
                
            System.out.println();
         }
        
    }
}





