import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;


/**
 * ======================================
 * MAIN CLASS - UseCasePalindromeApp
 * ======================================
 *
 * Use Case 6: Stack-Based Palindrome Checker
 *
 * Description:
 * This class checks validates a palindrome by using a queue and stack
 *
 *
 * At this stage, the application:
 * - Pushes into stack
 * - Pops in reverse
 * - Compares characters
 * - Displays the result on the console
 * - Queue (FIFO- First in First Out)
 * - Stack (LIFO- Last in First Out)
 *
 * This use case introduces fundamental comparison logic
 * before using advanced data structures and reduces extra memory usage.
 *
 * @lak-is-law Developer
 * @version 6.0
 */

public class PalindromeCheckerApp {
    /**
     * Application entry point for UC6.
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

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and push characters
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);   // enqueue
            stack.push(ch);  // push
        }

        boolean isPalindrome = true;

        // Compare dequeue vs pop
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome);
        sc.close();
    }
}