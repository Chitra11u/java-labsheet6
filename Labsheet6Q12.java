import java.util.Scanner;

class InvalidPatientAgeException extends Exception {
    public InvalidPatientAgeException(String message) {
        super(message);
    }
}

public class Labsheet6Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter patient name: ");
        String name = scanner.nextLine();

        try {
            System.out.print("Enter patient age: ");
            int age = Integer.parseInt(scanner.next());

            if (age < 0 || age > 120) {
                throw new InvalidPatientAgeException("Age must be between 0 and 120.");
            }
            System.out.println("Patient Name: " + name);
            System.out.println("Patient Age: " + age);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input for age.");
        } catch (InvalidPatientAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}
