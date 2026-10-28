public class BufferVsBuilder {
    public static void main(String[] args) {
        // 1. Thread-safe, synchronized, slower, introduced in Java 1.0
        StringBuffer sb = new StringBuffer();

        // 2. Not thread-safe, non-synchronized, faster, introduced in Java 5
        StringBuilder sb1 = new StringBuilder();

        /*
         * SUMMARY OF ESSENTIAL DIFFERENCES:
         *
         * - Performance: StringBuilder is faster because it lacks synchronization overhead.
         * - Best Practice: Use StringBuilder for 99% of tasks (local variables, loops).
         * - Legacy/Concurrency: Use StringBuffer only if multiple threads modify the same instance.
         * - Shared API: Both share the same methods (append, insert, reverse) via AbstractStringBuilder.
         */
    }
}
