import java.util.Deque;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Define input string
        String input = "madam";

        // Create Deque
        Deque<Character> deque = new LinkedList<>();

        // Step 1: Insert characters into deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Step 2 & 3: Remove first & last and compare
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}