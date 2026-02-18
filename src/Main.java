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
    }
}