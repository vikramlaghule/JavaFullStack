public class ThrowThrowsCustomException {

    // 1. throw
    static void throwExample(int age) {

        if (age < 18) {
            throw new IllegalArgumentException(
                    "Age must be 18 or above");
        }

        System.out.println("Eligible");
    }

    // 2. throws
    static void throwsExample() throws InterruptedException {

        System.out.println("Throws example");

        Thread.sleep(1000);

        System.out.println("Executed successfully");
    }

    // 3. Custom checked exception
    static class InvalidAgeException extends Exception {

        InvalidAgeException(String message) {
            super(message);
        }
    }

    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Invalid age");
        }

        System.out.println("Valid age");
    }

    // 4. Custom unchecked exception
    static class InsufficientBalanceException
            extends RuntimeException {

        InsufficientBalanceException(String message) {
            super(message);
        }
    }

    static void withdraw(int balance, int amount) {

        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient balance");
        }

        System.out.println("Withdrawal successful");
    }

    public static void main(String[] args) {

        System.out.println("===== THROW =====");

        try {
            throwExample(15);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n===== THROWS =====");

        try {
            throwsExample();
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted");
            Thread.currentThread().interrupt();
        }

        System.out.println("\n===== CUSTOM CHECKED EXCEPTION =====");

        try {
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n===== CUSTOM UNCHECKED EXCEPTION =====");

        try {
            withdraw(1000, 1500);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}