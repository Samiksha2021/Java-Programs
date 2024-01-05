public class characterpattern 
{

    static void c1(int n)
 {
    int row,col;
    for(row=1;row<=n;row++)
    {
        for (col=1;col<=row;col++)
        {
            System.out.print("A ");
        }
        System.out.println();
    }
 }
/*********************pattern2************************** */

static void c2(int n)
 {
    int row,col;
    for(row=1;row<=n;row++)
    {
        for(col=1;col<=row;col++)
        {
            System.out.print("  ");
        }
        for(col=row;col<=n;col++)
        {
            System.out.print("A ");
        }
        System.out.println();
    }
 }
/*****************************pattern3************************** */

   static void c3(int n)
  {
    int row,col;
    for(row=1;row<=n;row++)
    {
        for(col=row;col<=n;col++)
        {
            System.out.print("  ");
        }
        for(col=1;col<row;col++)
        {
            System.out.print("A ");
        }
        for(col=1;col<=row;col++)
        {
            System.out.print("A ");
        }
        System.out.println();
    }
  }
  /***********************pattern4********************************* */
  static void c4(int n)
  {
    int row,col;
    for(row=1;row<=n;row++)
    {
        for(col=1;col<=row;col++)
        {
            System.out.print("  ");
        }
        for(col=row;col<n;col++)
        {
            System.out.print("A ");
        }
        for(col=row;col<=n;col++)
        {
            System.out.print("A ");
        }
        
        System.out.println();
    }
  }    
  /********************pattern5****************************** */

  static void c5(int n)
  {
    int row,col;
    for(row=1;row<=n;row++)
    {
        for(col=row;col<=n;col++)
        {
            System.out.print("  ");
        }
        for(col=1;col<row;col++)
        {
            System.out.print("A ");
        }
          System.out.println();
        }
      
        for(row=1;row<=n;row++)
        {
            for(col=1;col<+row;col++)
            {
                System.out.print("  ");
            }
             for(col=row;col<=n;col++)
        {
            System.out.print("A ");
        
        }
             System.out.println();
    }
       
  }
  /*****************************pattern6 ************************** */
  static void c6(int n)
  {
    int row,col;
    for(row=1;row<n;row++)
      {
        for(col=1;col<=row;col++)
        {
            System.out.print("A ");
        }
            System.out.println();
     }
        for(row=1;row<=n;row++)
     {
            for(col=row;col<=n;col++)
            {
                System.out.print("A ");
            }
            System.out.println();
     }
 }
   
  /******************************pattern 7************************ */

  static void c7(int n)
  {
    int row,col;
    for(row=1;row<n;row++)
    {
         for(col=row;col<=n;col++)
        {
            System.out.print("  ");
        }
        for(col=1;col<row;col++)
        {
            System.out.print("A ");
        }
        for(col=1;col<=row;col++)
        {
            System.out.print("A ");
        }
        System.out.println();
    }
    for(row=1;row<=n;row++)
    {
        for(col=1;col<=row;col++)
        {
            System.out.print("  ");
        }
        for(col=row;col<n;col++)
        {
            System.out.print("A ");
        }
        for(col=row;col<=n;col++)
        {
            System.out.print("A ");
        }
        
        System.out.println();
    }
  }
  /**********************pattern 8****************************** */
  static void c8(int n)
  {
    int row,col,k;
    for(row=1, k='A';row<=n;row++,k++)
    {
        for(col=1;col<=row;col++)
        {
            System.out.print((char)k + " ");
        }
        System.out.println();
    }
  }
  /****************************pattern 9*************************** */
  static void c9(int n)
 {
    int row,col,k;
    for(row=1,k='A';row<=n;row++,k++)
    {
        for(col=1;col<=row;col++)
        {
            System.out.print("  ");
        }
        for(col=row;col<=n;col++)
        {
            System.out.print((char)k +" ");
        }
        System.out.println();
    }
 }
 /**************************pattern 10******************************** */
 static void c10(int n)
 {
    int row,col,k;
    for(row=1,k='A';row<=n;row++,k++)
    {
        for(col=row;col<=n;col++)
        {
            System.out.print("  ");
        }
        for(col=1;col<row;col++)
        {
            System.out.print((char)k+ " ");
        }
        for(col=1;col<=row;col++)
        {
            System.out.print( (char)k + " ");
        }
        System.out.println();
    }  
 }
 /**************************pattern11********************************* */

  static void c11(int n)
  {
    int row,col,k;
    for(row=1,k='A';row<=n;row++,k++)
    {
        for(col=1;col<=row;col++)
        {
            System.out.print("  ");
        }
        for(col=row;col<n;col++)
        {
            System.out.print((char)k + " ");
        }
        for(col=row;col<=n;col++)
        {
            System.out.print((char)k + " ");
        }
        
        System.out.println();
    }
  }    
  /********************************pattern 12********************* */
  static void c12(int n)
  {
    int row,col,k;
    for(row=1,k='A';row<n;row++,k++)
    {
         for(col=row;col<=n;col++)
        {
            System.out.print("  ");
        }
        for(col=1;col<row;col++)
        {
            System.out.print((char)k+ " ");
        }
        for(col=1;col<=row;col++)
        {
            System.out.print((char)k+ " ");
        }
        System.out.println();
    }
    for(row=1,k='E';row<=n;row++,k--)
    {
        for(col=1;col<=row;col++)
        {
            System.out.print("  ");
        }
        for(col=row;col<n;col++)
        {
            System.out.print((char)k +" ");
        }
        for(col=row;col<=n;col++)
        {
            System.out.print((char)k + " ");
        }
        
        System.out.println();
    }

  }
  /**********************************pattern 13****************************** */
  static void c13(int n)
  {
    int row,col,k;
    for(row=1,k='E';row<=n;row++,k--)
    {
        for(col=1;col<=row;col++)
        {
            System.out.print("  ");
        }
        for(col=row;col<=n;col++)
        {
            System.out.print((char)k +" ");
        }
        System.out.println();
    }

  }
  /******************************pattern 14****************************** */
 static void c14(int n)
 {
    int row,col,k;
    for(row=1,k='E';row<=n;row++,k--)
    {
        for(col=row;col<=n;col++)
        {
            System.out.print("  ");
        }
        for(col=1;col<row;col++)
        {
            System.out.print((char)k+ " ");
        }
        for(col=1;col<=row;col++)
        {
            System.out.print( (char)k + " ");
        }
        System.out.println();
    }  
 }
 /*************************************pattern 15************* */
 static void c15(int n)
  {
    int row,col,k;
    for(row=1,k='E';row<=n;row++,k--)
    {
        for(col=1;col<=row;col++)
        {
            System.out.print("  ");
        }
        for(col=row;col<n;col++)
        {
            System.out.print((char)k + " ");
        }
        for(col=row;col<=n;col++)
        {
            System.out.print((char)k + " ");
        }
        
        System.out.println();
    }
  }    
  /************************************pattern 16************************ */
   static void c16(int n)
  {
    int row,col,k;
    for(row=1, k='A';row<=n;row++)
    {
        for(col=1;col<=row;col++)
        {
            System.out.print((char)k + " ");
        }
        k=k+2;
        System.out.println();
    }
  }
  /**********************************pattern 17*********************** */
   static void c17(int n)
 {
    int row,col;
    for(row=1;row<=n;row++)
    {
        for(col=1;col<=row;col++)
        {
            System.out.print("  ");
        }
        for(col=row;col<=n;col++)
        {
            if(row%2==0)
            {
                System.out.print(0 + " ");
            }
            else{
                System.out.print("Z" +" ");

            }
            
        }
        System.out.println();
    }
 }
 /*****************************pattern 18****************************** */
 static void c18(int n)
  {
    int row,col;
    for(row=1;row<=n;row++)
    {
        for(col=1;col<=row;col++)
        {
            System.out.print("  ");
        }
        for(col=row;col<n;col++)
        {
            if(row%2==0)
            {
               System.out.print(0 + " ");
            }
            else
            {
                System.out.print("Z" + " ");
            }
            
        }
        for(col=row;col<=n;col++)
        {
            if(row%2==0)
            {
                System.out.print(0+ " ");

            }
            else{
                System.out.print("Z"+ " ");

            }
            
        }
        
        System.out.println();
    }
  }    
  /**************************pattern 19************************************** */
  static void c19(int n)
 {
    int row,col;
    for(row=1;row<=n;row++)
    {
        for(col=row;col<=n;col++)
        {
            System.out.print("  ");
        }
        for(col=1;col<row;col++)
        {
            if(row%2==0)
            {
                 System.out.print("#"+ " ");

            }
            else{
                System.out.print("A"+ " ");

            }
            
        }
        for(col=1;col<=row;col++)
        {
            if(row%2==0)
            {
                System.out.print( "#" + " ");

            }
            else{
                System.out.print( "A" + " ");

            }
            
        }
        System.out.println();
    }  
 }
 /************************pattern 20***************** */
 static void c20(int n)
 {
    int row,col,k;
    for(row=1, k='A';row<=n;row++,k++)
    {
        for(col=1,k='A';col<=row;col++,k++)
        {
            System.out.print((char)k + " ");
           
        }
        System.out.println();
    }
 }
 /**************************pattern 21*********************** */
 static void c21(int n)
 {
    int row,col;
    String s="AMAN";
     char[] c= s.toCharArray();
    int m= s.length();
    int i=0;
    for(row=1;row<=n;row++)
    {
        for(col=1;col<=row;col++)
        {
            System.out.print(c[i]+ " ");
        }
        i++;
        System.out.println();
    }
}
    /************************pattern 22************************ */
    static void c22( )
 {
    String s="CODE";
    char[] k= s.toCharArray();
    int m=s.length();
    int i=0;
    int row,col;
    for(row=1;row<=m;row++)
    {
        for(col=1;col<=row;col++)
        {
            System.out.print("  ");
        }
        for(col=row;col<=m;col++)
        {
            System.out.print(k[i] +" ");
        }
        i++;
        System.out.println();
    }
 }
 /******************************pattern 23***************************************** */

 static void c23()
 {
    String s="CODE";
    char[] c= s.toCharArray();
    int n = s.length();
    int i=0;
    int row,col;
    for(row=1;row<=n;row++)
    {
        for(col=1;col<=row;col++)
        {
            System.out.print(c[i]+ " ");
        }
        System.out.println();
    }
 }

 
    public static void main(String args[])
     {
        int n=5;
        c1(n);
        System.out.println();
        c2(n);
        System.out.println();
        c3(n);
        System.out.println();
        c4(n);
        System.out.println();
        c5(n);
        System.out.println();
        c6(n);
        System.out.println();
        c7(n);
        System.out.println();
        c8(n);
        System.out.println();
        c9(n);
        System.out.println();
        c10(n);
        System.out.println();
        c11(n);
        System.out.println();
        c12(n);
        System.out.println();
        c13(n);
        System.out.println();
        c14(n);
        System.out.println();
        c15(n);
        System.out.println();
        c16(n);
        System.out.println();
        c17(n);
        System.out.println( );
        c18(n);
        System.out.println();
        c19(n);
        System.out.println();
        c20(n);
        System.out.println();
        c21(n);
        System.out.println();
        c22();
        System.out.println();
     }
 }

 

  




