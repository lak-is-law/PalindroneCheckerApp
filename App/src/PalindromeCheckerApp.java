import java.util.*;


/**
 * ======================================
 * MAIN CLASS - UseCasePalindromeApp
 * ======================================
 *
 * Use Case UC13: Performance Comparison
 * Description:
 * This class checks validates a palindrome by using a queue and stack
 *
 * At this stage, the application:
 * Run multiple algorithms
 * Capture execution time
 * Display results
 *
 * This use case introduces fundamental comparison logic
 * before using advanced data structures and reduces extra memory usage.
 *
 * @lak-is-law Developer
 * @version 13.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC13.
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

        // Capture start time in nanoseconds
        long startTime = System.nanoTime();

        // Palindrome Logic (Two-pointer approach)
        boolean isPalindrome = true;
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Capture end time
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        // Output results
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + duration + " ns");

        sc.close();
    }
}