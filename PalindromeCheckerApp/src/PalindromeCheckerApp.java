public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Program starts
        String str = "madam";   // Hardcoded string

        // Hardcoded string is checked
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        // Result is printed
        if (str.equals(reversed)) {
            System.out.println("The string \"" + str + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + str + "\" is NOT a Palindrome.");
        }


    }
}