import java.util.*;


/**
 * ======================================
 * MAIN CLASS - UseCasePalindromeApp
 * ======================================
 *
 * Use Case UC12: Strategy Pattern for Palindrome Algorithms (Advanced)
 * Description:
 * This class checks validates a palindrome by using a queue and stack
 *
 * At this stage, the application:
 * Define PalindromeStrategy interface
 * Implement StackStrategy, DequeStrategy
 * Inject strategy at runtime
 *
 * This use case introduces fundamental comparison logic
 * before using advanced data structures and reduces extra memory usage.
 *
 * @lak-is-law Developer
 * @version 12.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC12.
     *
     * This is the first method executed by the JVM
     * when program starts.
     *
     * @param args Command-line arguements
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Input : ");
        String input = sc.nextLine();

        // 1. Create a stack to store characters
        Stack<Character> stack = new Stack<>();

        // 2. Push each character of the input onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // 3. Compare characters by popping from the stack
        boolean isPalindrome = true;
        for (char c : input.toCharArray()) {
            // Popping gives characters in reverse order
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome? : " + isPalindrome);

        sc.close();
    }
}
