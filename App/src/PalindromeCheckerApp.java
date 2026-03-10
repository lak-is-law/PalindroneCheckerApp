import java.util.*;


/**
 * ======================================
 * MAIN CLASS - UseCasePalindromeApp
 * ======================================
 *
 * Use Case UC9: Recursive Palindrome Checker
 * Description:
 * This class checks validates a palindrome by using a queue and stack
 *
 *
 * At this stage, the application:
 * Recursive call compares start & end
 * Base condition exits recursion
 *
 * This use case introduces fundamental comparison logic
 * before using advanced data structures and reduces extra memory usage.
 *
 * @lak-is-law Developer
 * @version 9.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC9.
     *
     * This is the first method executed by the JVM
     * when program starts.
     *
     * @param args Command-line arguements
     */
    public static void main(String[] args){
        String input = "madam";

        int start = 0;
        int end = input.length() - 1;

        boolean isPalindrome = true;

        // Compare characters from both ends
        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Print result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}