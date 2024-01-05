import java.util.Scanner;

public class product {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         System.out.print("Enter any number : ");
        int num = sc.nextInt();
        int product = 1;
        while(num != 0) {

            product = product * (num % 10);

            
            num = num / 10;
        }

        System.out.println("Product of all digits " + " : " + product);
    }

}
