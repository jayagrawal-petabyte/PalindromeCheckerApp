public class PalindromeCheckerApp {
    public static void main(String[] args) {


        String input = "civic";

        Queue<Character> queue = new LinkedList<>();

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            queue.add(c);   // enqueue
            stack.push(c);  // push
        }

        boolean isPalindrome = true;

        while (!queue.isEmpty()) {

            char fromQueue = queue.remove(); // dequeue
            char fromStack = stack.pop();    // pop

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?");
        System.out.println(isPalindrome);
    }
}