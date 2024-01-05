import java.util.Scanner;
public class ci{
    public static void main(String args[]) {
       Scanner input = new Scanner(System.in);
     
        System.out.println("The entered principle amount is " );
     double p = input.nextDouble();
        System.out.println("The entered rate is " );
     double r = input.nextDouble();
        System.out.println("The entered time period is " );
     double t = input.nextDouble();
        System.out.println("The entered number of times the interest is compounded is " );
     double n = input.nextDouble();

        double amount = p * Math.pow(1 + (r / n), n * t);
        double cinterest = amount - p;

        System.out.println("Compound Interest after " + t + " years: "+ cinterest);
    }
}


