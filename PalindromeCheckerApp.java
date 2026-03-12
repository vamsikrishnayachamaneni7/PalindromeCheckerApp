public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("      PALINDROME CHECKER APP       ");
        System.out.println("===================================");
        System.out.println("Application Version : 1.0");
        System.out.println("Welcome to the Palindrome Checker Application");
        System.out.println("===================================");

        // UC2: Hardcoded Palindrome Check
        String word = "madam";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        if (word.equals(reversed)) {
            System.out.println("The word '" + word + "' is a Palindrome.");
        } else {
            System.out.println("The word '" + word + "' is NOT a Palindrome.");
        }

    }

}