import java.util.Scanner;

public class alphabet {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any character : ");
        char ch = scanner.next().charAt(0);

        if(ch >= 'a' && ch <= 'z') {

             System.out.println(ch + " is in lowercase.");

        } else {
             System.out.println(ch + " is in uppercase.");

}  }
}
 
