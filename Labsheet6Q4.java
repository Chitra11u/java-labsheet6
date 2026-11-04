import java.util.Scanner;

public class Labsheet6Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {5, 10, 15, 20, 25};

        try {
            System.out.print("Enter numerator string: ");
            int num1 = Integer.parseInt(scanner.next());

            System.out.print("Enter denominator string: ");
            int num2 = Integer.parseInt(scanner.next());

            int result = num1 / num2;
            System.out.println("Division Result: " + result);

            System.out.print("Enter array index: ");
            int index = scanner.nextInt();
            System.out.println("Array Element: " + numbers[index]);

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: Division by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Index out of bounds.");
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: Invalid integer format.");
        }
        scanner.close();
    }
}
