import java.util.Scanner;

/**
 * ======================================
 * MAIN CLASS - UseCasePalindromeApp
 * ======================================
 *
 * Use Case 2: Hardcoded Palindrome Validation
 *
 * Description:
 * This class demonstarts basic palindrome validation
 * using a hardcoded string value.
 *
 * At this stage, the application:
 * - Stores a predefined string
 * - Compares characters from both the ends
 * - Determines whether the string is a palindrome
 * - Displays the result on the console
 *
 * This use case introduces fundamental comparison logic
 * before using advanced data structures.
 *
 * @lak-is-law Developer
 * @version 2.0
 */

public class PalindromeCheckerApp {
    /**
     * Application entry point for UC2.
     *
     * This is the first method executed by the JVM
     * when program starts.
     *
     * @param args Command-line arguements
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text: ");
        String input = sc.nextLine();

        boolean isPalindrome = true;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is it a palindrome? "+isPalindrome);
        sc.close();
    }
}