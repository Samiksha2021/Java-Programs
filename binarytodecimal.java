import java.util.Scanner;
public class binarytodecimal {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a binary number: ");
String binary = scanner.nextLine();
if (isValidBinary(binary)) {
    int decimal = binaryToDecimal(binary);
    System.out.println("Decimal equivalent:" + decimal);
    } else {
    System.out.println("Invalid binary input.");
    }
    scanner.close();
    }
    public static boolean isValidBinary(String binary) {
    return binary.matches("[01]+");
    }
    public static int binaryToDecimal(String binary) {
    int decimal = 0;
    int binaryLength = binary.length();
    for (int i = 0; i < binaryLength; i++) {
    int bit = Character.getNumericValue(binary.charAt(i));
    int power = binaryLength - 1 - i;
    decimal += bit * Math.pow(2, power);
    }
    return decimal;
    }}
