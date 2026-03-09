public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "sadas";

        boolean isPalindrome = checkPalindrome(input, 0, input.length() - 1);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?");
        System.out.println(isPalindrome);
    }

    private static boolean checkPalindrome(String str, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return checkPalindrome(str, start + 1, end - 1);
    }
}