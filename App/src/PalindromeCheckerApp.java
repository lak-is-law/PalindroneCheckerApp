import java.util.*;


/**
 * ======================================
 * MAIN CLASS - UseCasePalindromeApp
 * ======================================
 *
 * Use Case UC11: Object-Oriented Palindrome Service
 * Description:
 * This class checks validates a palindrome by using a queue and stack
 *
 *
 * At this stage, the application:
 * Create PalindromeChecker class
 * Expose checkPalindrome() method
 *
 * This use case introduces fundamental comparison logic
 * before using advanced data structures and reduces extra memory usage.
 *
 * @lak-is-law Developer
 * @version 11.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC11.
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

        int start = 0;
        int end = input.length() - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Is Palindrome? : " + isPalindrome);

        sc.close();
    }
}