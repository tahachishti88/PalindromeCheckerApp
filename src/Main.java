import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("====================================");
        System.out.println("   Welcome to Palindrome Checker   ");
        System.out.println("   Version: 1.0                    ");
        System.out.println("====================================");
        System.out.println();


        String hardcoded = "madam";
        String hardcodedReversed = "";
        for (int i = hardcoded.length() - 1; i >= 0; i--) {
            hardcodedReversed = hardcodedReversed + hardcoded.charAt(i);
        }
        if (hardcoded.equals(hardcodedReversed)) {
            System.out.println("[Hardcoded Check] \"" + hardcoded + "\" is a Palindrome.");
        } else {
            System.out.println("[Hardcoded Check] \"" + hardcoded + "\" is NOT a Palindrome.");
        }
        System.out.println();


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String original = scanner.nextLine();

        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        if (original.equals(reversed)) {
            System.out.println("\"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + original + "\" is NOT a Palindrome.");
        }

        scanner.close();
    }
}
