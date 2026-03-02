import java.util.Scanner;

/**
 * ======================================
 * MAIN CLASS - UseCasePalindromeApp
 * ======================================
 *
 * Use Case 4:Character Array Based Palindrome Check
 *
 * Description:
 * This class checks validates a palindrrome by converting
 *the string into a character array and compare characters using two pointer technique
 *
 * At this stage, the application:
 * - Converts string into character array
 * - Uses start and end pointers
 * - Compares characters
 * - Displays the result on the console
 *
 * This use case introduces fundamental comparison logic
 * before using advanced data structures and reduces extra memory usage.
 *
 * @lak-is-law Developer
 * @version 4.0
 */

public class PalindromeCheckerApp {
    /**
     * Application entry point for UC4.
     *
     * This is the first method executed by the JVM
     * when program starts.
     *
     * @param args Command-line arguements
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char[] characters = input.toCharArray();

        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Print using boolean
        System.out.println("Is Palindrome? : " +isPalindrome);

        sc.close();
    }
}