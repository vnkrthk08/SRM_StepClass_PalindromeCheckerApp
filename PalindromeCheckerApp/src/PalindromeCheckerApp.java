class PalindromeAlgorithms {

    // 1️⃣ Reverse using loop
    public static boolean reverseMethod(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return str.equals(reversed);
    }

    // 2️⃣ Two-pointer approach
    public static boolean twoPointerMethod(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    // 3️⃣ Stack method
    public static boolean stackMethod(String str) {
        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : str.toCharArray()) {
            if (ch != stack.pop())
                return false;
        }
        return true;
    }

    // 4️⃣ Recursion method
    public static boolean recursionMethod(String str, int start, int end) {
        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return recursionMethod(str, start + 1, end - 1);
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madamimadam";  // bigger string gives better timing

        long startTime, endTime;

        // Reverse Method
        startTime = System.nanoTime();
        PalindromeAlgorithms.reverseMethod(input);
        endTime = System.nanoTime();
        System.out.println("Reverse Method Time: " + (endTime - startTime) + " ns");

        // Two Pointer
        startTime = System.nanoTime();
        PalindromeAlgorithms.twoPointerMethod(input);
        endTime = System.nanoTime();
        System.out.println("Two Pointer Method Time: " + (endTime - startTime) + " ns");

        // Stack Method
        startTime = System.nanoTime();
        PalindromeAlgorithms.stackMethod(input);
        endTime = System.nanoTime();
        System.out.println("Stack Method Time: " + (endTime - startTime) + " ns");

        // Recursion Method
        startTime = System.nanoTime();
        PalindromeAlgorithms.recursionMethod(input, 0, input.length() - 1);
        endTime = System.nanoTime();
        System.out.println("Recursion Method Time: " + (endTime - startTime) + " ns");
    }
}