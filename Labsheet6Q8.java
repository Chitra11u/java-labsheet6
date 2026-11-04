public class Labsheet6Q8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        try {
            int res = 10 / 2;
            try {
                int val = arr[5];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner Catch: Array index out of bounds.");
            }
            int div = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Outer Catch: Arithmetic exception caught.");
        }
    }
}
