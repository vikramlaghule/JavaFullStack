public class AdvancedExceptionHandling {

    // 1. Nested try-catch
    static void nestedTryExample() {

        try {
            System.out.println("Outer try started");

            try {
                int result = 10 / 0;
                System.out.println(result);

            } catch (ArithmeticException e) {
                System.out.println(
                        "Inner catch: ArithmeticException");
            }

            System.out.println("Outer try completed");

        } catch (Exception e) {
            System.out.println("Outer catch");
        }
    }

    // 2. Exception propagation
    static void method1() {
        method2();
    }

    static void method2() {
        method3();
    }

    static void method3() {

        int result = 10 / 0;

        System.out.println(result);
    }

    // 3. Multi-catch
    static void multiCatchExample() {

        try {
            int[] arr = {10, 20};
            System.out.println(arr[5]);

        } catch (ArithmeticException |
                 ArrayIndexOutOfBoundsException e) {

            System.out.println(
                    "Exception: " +
                    e.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {

        System.out.println("===== NESTED TRY =====");
        nestedTryExample();

        System.out.println("\n===== EXCEPTION PROPAGATION =====");

        try {
            method1();
        } catch (ArithmeticException e) {
            System.out.println(
                    "Exception propagated to main");
        }

        System.out.println("\n===== MULTI-CATCH =====");
        multiCatchExample();

        System.out.println("\n===== PROGRAM COMPLETED =====");
    }
}