import java.util.Scanner;
public class lcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number:" );
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        int lcm = calculateLCM(num1, num2);
        System.out.println("LCM of " + num1 + " and "  + num2 +  " is: "+ lcm);
        }
        public static int calculateLCM(int a, int b) {
        return (a * b) / calculateGCD(a, b);
        }
        public static int calculateGCD(int a, int b) {
        if (b == 0) {
        return a;
        } else {
        return calculateGCD(b, a % b);
        }
        }
    
}
