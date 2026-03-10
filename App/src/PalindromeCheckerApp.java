import java.util.*;


/**
 * ======================================
 * MAIN CLASS - UseCasePalindromeApp
 * ======================================
 *
 * Use Case UC7: Deque-Based Optimized Palindrome Checker
 *
 * Description:
 * This class checks validates a palindrome by using a queue and stack
 *
 *
 * At this stage, the application:
 * Insert characters into deque
 * Remove first & last
 * Compare until empty
 *
 * This use case introduces fundamental comparison logic
 * before using advanced data structures and reduces extra memory usage.
 *
 * @lak-is-law Developer
 * @version 7.0
 */

public class PalindromeCheckerApp {
    /**
     * Application entry point for UC7.
     *
     * This is the first method executed by the JVM
     * when program starts.
     *
     * @param args Command-line arguements
     */
    public static void main(String[] args){
        // Define the input string
        String input = "refer";

        // Create a Deque to store characters
        Deque<Character> deque = new ArrayDeque<>();

        // Add each character to the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Flag to track palindrome result
        boolean isPalindrome = true;

        // Continue comparison while more than one element exists
        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}