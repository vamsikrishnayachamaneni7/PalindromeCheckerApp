import java.util.Stack;

public class UseCase13PalindromePerformanceApp {

    // Method 1: String Reverse
    public static boolean reverseCheck(String word) {
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        return word.equals(reversed);
    }

    // Method 2: Stack Based
    public static boolean stackCheck(String word) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return word.equals(reversed);
    }

    public static void main(String[] args) {

        String word = "madam";

        // Reverse Method timing
        long start1 = System.nanoTime();
        boolean result1 = reverseCheck(word);
        long end1 = System.nanoTime();

        // Stack Method timing
        long start2 = System.nanoTime();
        boolean result2 = stackCheck(word);
        long end2 = System.nanoTime();

        System.out.println("Reverse Method Result: " + result1);
        System.out.println("Execution Time: " + (end1 - start1) + " ns");

        System.out.println("Stack Method Result: " + result2);
        System.out.println("Execution Time: " + (end2 - start2) + " ns");
    }
}