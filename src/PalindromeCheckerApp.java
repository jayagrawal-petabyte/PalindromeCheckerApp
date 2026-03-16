import java.util.*;

// Strategy Interface
interface PalindromeStrategy {
    boolean check(String input);
}

// Stack Strategy Implementation
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters while popping
        for (char c : input.toCharArray()) {
            if (stack.pop() != c) {
                return false;
            }
        }

        return true;
    }
}

// Deque Strategy Implementation
class DequeStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}

// Main Application Class
public class UseCase12PalindromeCheckerApp {

    private PalindromeStrategy strategy;

    // Inject strategy at runtime
    public UseCase12PalindromeCheckerApp(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean checkPalindrome(String input) {
        return strategy.check(input);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Choose strategy (StackStrategy or DequeStrategy)
        PalindromeStrategy strategy = new StackStrategy();

        UseCase12PalindromeCheckerApp app =
                new UseCase12PalindromeCheckerApp(strategy);

        boolean result = app.checkPalindrome(input);

        System.out.println("Is Palindrome: " + result);
    }
}