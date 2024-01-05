 import java.util.Scanner;
public class hextodecimal {

    public static boolean isValidHexadecimal(String hex) {
return hex.matches("[0-9A-Fa-f]+");
}

public static int hexToDecimal(String hex) {
int decimal = 0;
int hexLength = hex.length();
for (int i = 0; i<hexLength; i++) {
char digit = hex.charAt(i);
int value = Character.digit(digit, 16);
int power = hexLength - 1 - i;
decimal += value * Math.pow(16, power);
}
return decimal;
}
   
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a hexadecimal number:");
String hex = scanner.nextLine();
if (isValidHexadecimal(hex)) 
{
int decimal = hexToDecimal(hex);
System.out.println("Decimal equivalent: " + decimal);
} 
else {
System.out.println("Invalid hexadecimal input.");
}
}

}
