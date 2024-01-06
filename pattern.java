public class pattern 
{

    public static void main(String args[]) 
    {
        //increasing space k liye col<=n
        //decreasing space  k liye col<=row

        int n=8;
        pattern obj= new pattern();
        obj.p1(n);       //square pattern
        System.out.println();
        obj.p2(n);       // Increasing pattern
        System.out.println();
        obj.p3(n);       //Decreasing pattern
        System.out.println();
        obj.p4(n);      //left half pyramid
        System.out.println();
        obj.p5(n);      //reverse left half pyramid
        System.out.println();
        obj.p6(n);      //triangle pattern
        System.out.println();
        obj.p7(n);      //reverse triangle
        System.out.println();
        obj.p8(n);
        System.out.println();
        obj.p9(n);
        System.out.println();

    }
    /*************************square************************************************* */

    void p1(int n)
    {
        int row,col;
        //outer for loop (this is for row)
        for(row=1;row<=n;row++)
        {
        //inner for loop (this is for col)
            for (col=1;col<=n;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*********************Increasing pattern/decreasing space************************************* */
    
     void p2(int n)
    {
        int row,col;
         //outer for loop (this is for row)
        for(row=1;row<=n;row++)
        {
             //inner for loop (this is for col)
            for (col=1;col<=row;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /****************************Decreasing Pattern/increasing space********************************* */

     void p3(int n)
    {
        int row,col;
         //outer for loop (this is for row)
        for(row=1;row<=n;row++)
        {
            //inner for loop (this is for col)
            for (col=row;col<=n;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /***********************left half pyramid******************************** */
    
     void p4(int n)
    {
        int row,col;
        //outer for loop (this is for row)
        for(row=1;row<=n;row++)
        {
            //inner for loop (this is for col)
            for (col=row;col<=n;col++)
            {
                System.out.print("  ");
            }
            for(col=1;col<=row;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*********************************reverse left half pyramid********************************** */
     void p5(int n)
    {
        int row,col;
        //outer for loop (this is for row)
        for(row=1;row<=n;row++)
        {
            //inner for loop (this is for col)
            for (col=1;col<=row;col++)
            {
                System.out.print("  ");
            }
            for(col=row;col<=n;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /************************triangle pattern****************************** */

     void p6(int n)
    {
        int row,col;
        //outer for loop (this is for row)
        for(row=1;row<=n;row++)
        {
            //inner for loop (this is for col)
            for (col=row;col<=n;col++)
            {
                System.out.print(" ");
            }
            for(col=1;col<=row;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*****************************reverse triangle********************** */
      void p7(int n)
    {
        int row,col;
        //outer for loop (this is for row)
        for(row=1;row<=n;row++)
        {
            //inner for loop (this is for col)
            for (col=1;col<=row;col++)
            {
                System.out.print(" ");
            }
            for(col=row;col<=n;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /********************************hill********************************* */
      void p8(int n)
    {

        int row,col;
        //outer for loop (this is for row)
        for(row=1;row<=n;row++)
        {
            //inner for loop (this is for col)
            for (col=row;col<=n;col++)
            {
                System.out.print("  ");
            }
            for(col=1;col<row;col++)
            {
                System.out.print("* ");
            }
             for (col=1;col<=row;col++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    /***********************triangle******************************* */

      void p9(int n)
    {
        int row,col;
        //outer for loop (this is for row)
        for(row=1;row<=n-1;row++)
        {
            for(col=row;col<=n;col++)
            {
                System.out.print(" ");
            }
            for(col=1;col<=row;col++)
            {
                System.out.print("* ");
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
                System.out.print("* ");
            }
            System.out.println();
         }
 

    }
}
