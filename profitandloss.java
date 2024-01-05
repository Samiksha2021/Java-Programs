import java.util.Scanner;
class profitandLoss
{
      
   public static void main(String args[]) 
    {   
	
            	Scanner s= new Scanner(System.in);
         	System.out.print("Enter the Cost price: ");
         	double cp=s.nextDouble();
		System.out.print("Enter the Selling price:");
         	double sp=s.nextDouble();
 
		if(cp-sp>0)
                {
		  System.out.println("loss:" +(cp-sp));
		}
		else if(cp-sp<0)
                {
		  System.out.println("profit:" +(sp-cp));
		}
		else
		
		  System.out.println("NEUTRAL");
          
   }
}