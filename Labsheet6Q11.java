import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class Labsheet6Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter account balance: ");
            double balance = Double.parseDouble(scanner.next());

            System.out.print("Enter withdrawal amount: ");
            double amount = Double.parseDouble(scanner.next());

            if (amount < 0) {
                System.out.println("Error: Withdrawal amount cannot be negative.");
            } else if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient balance for this withdrawal.");
            } else {
                balance -= amount;
                System.out.println("Withdrawal successful. Remaining balance: " + balance);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input.");
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Bank transaction completed.");
        }
        scanner.close();
    }
}
