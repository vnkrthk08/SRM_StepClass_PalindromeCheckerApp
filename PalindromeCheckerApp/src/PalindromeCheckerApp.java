// 1️⃣ Strategy Interface
interface PalindromeStrategy {
    boolean checkPalindrome(String input);
}

// 2️⃣ Stack Strategy Implementation
class StackStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String input) {

        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : input.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// 3️⃣ Deque Strategy Implementation
class DequeStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String input) {

        java.util.Deque<Character> deque = new java.util.LinkedList<>();

        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }
}

// 4️⃣ Context Class (Strategy Injector)
class PalindromeContext {

    private PalindromeStrategy strategy;

    public PalindromeContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeStrategy(String input) {
        return strategy.checkPalindrome(input);
    }
}

// 5️⃣ Main Class
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        // Choose Stack Strategy
        PalindromeContext context = new PalindromeContext(new StackStrategy());
        System.out.println("Using Stack Strategy: " +
                context.executeStrategy(input));

        // Switch to Deque Strategy at runtime
        context.setStrategy(new DequeStrategy());
        System.out.println("Using Deque Strategy: " +
                context.executeStrategy(input));
    }
}