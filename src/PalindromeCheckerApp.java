public class PalindromeCheckerApp {
    public static void main(String[] args) {

        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version: 1.0");
        System.out.println("System initialized successfully.");

        // Hardcoded input string
        String input = "madan";

        boolean isPalindrome = false;

        // Loop only till half of the string length
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) == input.charAt(input.length() - 1 - i)) {
                isPalindrome = true;
                break;
            }
        }

        // Display output
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome?: ");
        System.out.println(isPalindrome);
    }
}