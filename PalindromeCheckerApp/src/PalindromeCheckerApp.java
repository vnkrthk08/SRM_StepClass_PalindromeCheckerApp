// PalindromeChecker class
class PalindromeChecker {

    // Method to check palindrome
    public boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

// Main class
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        // Create object of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}