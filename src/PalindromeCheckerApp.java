public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "level";

        Deque<Character> deque = new LinkedList<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {

            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

         System.out.println("Input: " + input);
        System.out.println("Is Palindrome?");
        System.out.println(isPalindrome);
    }
}