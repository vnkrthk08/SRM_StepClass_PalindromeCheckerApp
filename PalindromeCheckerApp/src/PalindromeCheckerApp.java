public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String original = "madam";   // Hardcoded string
        String reversed = "";

        // Step 1: Reverse string using loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Step 2 & 3: Compare and Display result
        if (original.equals(reversed)) {
            System.out.println("The string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
        }
    }
}