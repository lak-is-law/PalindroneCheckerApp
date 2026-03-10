import java.util.*;


/**
 * ======================================
 * MAIN CLASS - UseCasePalindromeApp
 * ======================================
 *
 * Use Case UC10: Case-Insensitive & Space-Ignored Palindrome
 * Description:
 * This class checks validates a palindrome by using a queue and stack
 *
 *
 * At this stage, the application:
 * Normalize string
 * Apply previous logic
 *
 * This use case introduces fundamental comparison logic
 * before using advanced data structures and reduces extra memory usage.
 *
 * @lak-is-law Developer
 * @version 10.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC10.
     *
     * This is the first method executed by the JVM
     * when program starts.
     *
     * @param args Command-line arguements
     */
    public static void main(String[] args){
        // Initialize the scanner with the name 'sc'
        Scanner sc = new Scanner(System.in);

        // 1. Get Input from user
        System.out.print("Input : ");
        String input = sc.nextLine();

        // 2. Normalize the string: remove all spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // 3. Palindrome logic based on your hint
        boolean isPalindrome = true;

        for (int i = 0; i < normalized.length() / 2; i++) {
            // Compare characters from the start and the end moving inward
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // 4. Print the final result
        System.out.println("Is Palindrome? : " + isPalindrome);

        sc.close();
    }
}