public class BasicExceptionHandling {

    // 1. try-catch
    static void tryCatchExample() {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }

    // 2. Multiple catch
    static void multipleCatchExample() {
        try {
            int[] arr = {10, 20};
            System.out.println(arr[5]);

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");

        } catch (Exception e) {
            System.out.println("Exception");
        }
    }

    // 3. finally
    static void finallyExample() {
        try {
            int result = 10 / 2;
            System.out.println("Result = " + result);

        } catch (ArithmeticException e) {
            System.out.println("Exception occurred");

        } finally {
            System.out.println("Finally block executed");
        }
    }

    // 4. Common exceptions
    static void commonExceptions() {

        // NullPointerException
        try {
            String name = null;
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }

        // NumberFormatException
        try {
            int number = Integer.parseInt("abc");
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }

        // ArrayIndexOutOfBoundsException
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }

    public static void main(String[] args) {

        System.out.println("===== TRY-CATCH =====");
        tryCatchExample();

        System.out.println("\n===== MULTIPLE CATCH =====");
        multipleCatchExample();

        System.out.println("\n===== FINALLY =====");
        finallyExample();

        System.out.println("\n===== COMMON EXCEPTIONS =====");
        commonExceptions();
    }
}