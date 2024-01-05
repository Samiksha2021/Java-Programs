 import java.util.Scanner;
 public class primenumber
 {
    public static boolean isPrimeNumber(int num) {
if (num <= 1) {
return false;
}
if (num <= 3) {
return true;
}
if (num % 2 == 0 || num % 3 == 0) {
return false;
}
for (int i = 5; i * i <= num; i += 6) {
if (num % i == 0 || num % (i + 2) == 0) {
return false;
}
}
return true;
}
public static void main(String[] args) {
Scanner n = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = n.nextInt();
boolean isPrime = isPrimeNumber(number);
if (isPrime) {
System.out.println(number + " is a prime number." );
} else {
System.out.println(number + " is not a prime number.");
}
}
}