import java.util.Scanner;

public class Labsheet6Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to convert to an integer: ");
        String str = scanner.next();

        try {
            int number = Integer.parseInt(str);
            System.out.println("Converted integer: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: The string does not contain a valid integer.");
        }
        scanner.close();
    }
}
