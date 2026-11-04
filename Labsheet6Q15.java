import java.util.Scanner;

class InvalidQuantityException extends Exception {
    public InvalidQuantityException(String message) {
        super(message);
    }
}

class InsufficientMedicineStockException extends Exception {
    public InsufficientMedicineStockException(String message) {
        super(message);
    }
}

public class Labsheet6Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter medicine name: ");
        String medicineName = scanner.nextLine();

        try {
            System.out.print("Enter available quantity: ");
            int availableQty = Integer.parseInt(scanner.next());

            System.out.print("Enter required quantity: ");
            int requiredQty = Integer.parseInt(scanner.next());

            if (availableQty < 0 || requiredQty < 0) {
                throw new InvalidQuantityException("Quantities cannot be negative.");
            }

            if (requiredQty > availableQty) {
                throw new InsufficientMedicineStockException("Required quantity exceeds available stock.");
            }

            int remainingQty = availableQty - requiredQty;
            System.out.println("Transaction successful for " + medicineName + ". Remaining stock: " + remainingQty);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input.");
        } catch (InvalidQuantityException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientMedicineStockException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Inventory transaction is completed.");
        }
        scanner.close();
    }
}
