import java.util.*;


/**
 * ======================================
 * MAIN CLASS - UseCasePalindromeApp
 * ======================================
 *
 * Use Case UC8: Linked List Based Palindrome Checker
 * Description:
 * This class checks validates a palindrome by using a queue and stack
 *
 *
 * At this stage, the application:
 * Convert string to linked list
 * Reverse second half
 * Compare halves
 *
 * This use case introduces fundamental comparison logic
 * before using advanced data structures and reduces extra memory usage.
 *
 * @lak-is-law Developer
 * @version 8.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC8.
     *
     * This is the first method executed by the JVM
     * when program starts.
     *
     * @param args Command-line arguements
     */
    public static void main(String[] args){
        // Define the input string
        String input = "level";

        // Create a LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // Add each character to the linked list
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        // Flag to track palindrome state
        boolean isPalindrome = true;

        // Compare until only one or zero elements remain
        while (list.size() > 1) {

            char first = list.removeFirst();
            char last = list.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}