import java.util.Scanner;

/**
 * ======================================
 * MAIN CLASS - UseCasePalindromeApp
 * ======================================
 *
 * Use Case 3: Reverse String Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with the orignal value.
 *
 * At this stage, the application:
 * - Iterates the string
 * - Builds a reversed version
 * - Compares orignal and reversed strings
 * - Displays the result on the console
 *
 * This use case introduces fundamental comparison logic
 * before using advanced data structures.
 *
 * @lak-is-law Developer
 * @version 3.0
 */

public class PalindromeCheckerApp {
    /**
     * Application entry point for UC3.
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

        String reversed = "";

        // Reverse string using for loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare original and reversed string
        if (input.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}