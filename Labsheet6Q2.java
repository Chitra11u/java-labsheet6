import java.util.Scanner;

public class Labsheet6Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Enter array index (0-4): ");
        int index = scanner.nextInt();

        try {
            System.out.println("Element at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index. Please enter an index between 0 and 4.");
        }
        scanner.close();
    }
}
