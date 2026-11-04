import java.util.Scanner;

class InvalidExamMarksException extends Exception {
    public InvalidExamMarksException(String message) {
        super(message);
    }
}

public class Labsheet6Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter exam marks: ");
            int marks = Integer.parseInt(scanner.next());

            if (marks < 0 || marks > 100) {
                throw new InvalidExamMarksException("Marks must be between 0 and 100.");
            }

            if (marks >= 40) {
                System.out.println("Result: PASS");
            } else {
                System.out.println("Result: FAIL");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input.");
        } catch (InvalidExamMarksException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Exam evaluation completed.");
        }
        scanner.close();
    }
}
