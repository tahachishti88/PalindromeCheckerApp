import java.util.Scanner;

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

        scanner.close();
    }
}