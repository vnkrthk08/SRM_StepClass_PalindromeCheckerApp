public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        // Step 1: Normalize string
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Step 2: Apply two-pointer logic
        int start = 0;
        int end = normalized.length() - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Print result
        System.out.println("Original Input : " + input);
        System.out.println("Normalized     : " + normalized);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}