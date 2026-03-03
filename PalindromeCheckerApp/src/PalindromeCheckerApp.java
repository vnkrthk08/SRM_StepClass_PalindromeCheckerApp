import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String original = "madam";   // Hardcoded string
        Stack<Character> stack = new Stack<>();

        // Step 1: Push characters into stack
        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }

        // Step 2: Pop and compare
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        // Step 3: Print result
        if (original.equals(reversed)) {
            System.out.println("The string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
        }
    }
}