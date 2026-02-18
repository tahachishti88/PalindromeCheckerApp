import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("   Welcome to Palindrome Checker   ");
        System.out.println("   Version: 1.0                    ");
        System.out.println("====================================");
        System.out.println();

        String hardcoded = "madam";
        if (hardcoded.equals(new StringBuilder(hardcoded).reverse().toString())) {
            System.out.println("[UC2 - Hardcoded] \"" + hardcoded + "\" is a Palindrome.");
        } else {
            System.out.println("[UC2 - Hardcoded] \"" + hardcoded + "\" is NOT a Palindrome.");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("[UC3 - String Reverse] Enter a string: ");
        String input3 = scanner.nextLine();
        String reversed = "";
        for (int i = input3.length() - 1; i >= 0; i--) {
            reversed = reversed + input3.charAt(i);
        }
        if (input3.equals(reversed)) {
            System.out.println("\"" + input3 + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + input3 + "\" is NOT a Palindrome.");
        }
        System.out.println();

        System.out.print("[UC4 - Char Array] Enter a string: ");
        String input4 = scanner.nextLine();
        char[] chars = input4.toCharArray();
        int left = 0, right = chars.length - 1;
        boolean isPalindrome = true;
        while (left < right) {
            if (chars[left] != chars[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println("\"" + input4 + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + input4 + "\" is NOT a Palindrome.");
        }
        System.out.println();

        System.out.print("[UC5 - Stack] Enter a string: ");
        String input5 = scanner.nextLine();
        Stack<Character> stack = new Stack<>();
        for (char c : input5.toCharArray()) {
            stack.push(c);
        }
        String stackReversed = "";
        while (!stack.isEmpty()) {
            stackReversed = stackReversed + stack.pop();
        }
        if (input5.equals(stackReversed)) {
            System.out.println("\"" + input5 + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + input5 + "\" is NOT a Palindrome.");
        }
        System.out.println();

        System.out.print("[UC6 - Queue + Stack] Enter a string: ");
        String input6 = scanner.nextLine();
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack6 = new Stack<>();
        for (char c : input6.toCharArray()) {
            queue.add(c);
            stack6.push(c);
        }
        boolean isQSPalindrome = true;
        while (!queue.isEmpty()) {
            if (!queue.poll().equals(stack6.pop())) {
                isQSPalindrome = false;
                break;
            }
        }
        if (isQSPalindrome) {
            System.out.println("\"" + input6 + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + input6 + "\" is NOT a Palindrome.");
        }

        scanner.close();
    }
}