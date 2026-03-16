import java.util.*;

// Strategy Interface
interface PalindromeStrategy {
    boolean check(String input);
}

// Stack Strategy
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (stack.pop() != c) {
                return false;
            }
        }

        return true;
    }
}

// Deque Strategy
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

// Main Class
public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input:");
        String input = scanner.nextLine();

        // Strategy 1: Stack
        PalindromeStrategy stackStrategy = new StackStrategy();

        long startTime = System.nanoTime();
        boolean result1 = stackStrategy.check(input);
        long endTime = System.nanoTime();

        long stackExecutionTime = endTime - startTime;

        System.out.println("Stack Strategy -> Is Palindrome: " + result1);
        System.out.println("Execution Time: " + stackExecutionTime + " ns");

        // Strategy 2: Deque
        PalindromeStrategy dequeStrategy = new DequeStrategy();

        startTime = System.nanoTime();
        boolean result2 = dequeStrategy.check(input);
        endTime = System.nanoTime();

        long dequeExecutionTime = endTime - startTime;

        System.out.println("Deque Strategy -> Is Palindrome: " + result2);
        System.out.println("Execution Time: " + dequeExecutionTime + " ns");
    }
}