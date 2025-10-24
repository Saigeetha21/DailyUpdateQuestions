package apr22.FunctionalInterface.com;

@FunctionalInterface
interface PalindromeChecker {
    boolean check(String str);
}
public class Palindrome {
	public static void main(String[] args) {
        // Defining a lambda expression to check if a string is a palindrome
        PalindromeChecker isPalindrome = str -> {
            String cleanStr = str.replaceAll("\\s+", "").toLowerCase();
            int length = cleanStr.length();
            for (int i = 0; i < length / 2; i++) {
                if (cleanStr.charAt(i) != cleanStr.charAt(length - i - 1)) {
                    return false;
                }  
            }
            return true;
        };

        // Using the isPalindrome operation
        System.out.println("Is 'radar' a palindrome? " + isPalindrome.check("radar")); // Should print true
        System.out.println("Is 'Java' a palindrome? " + isPalindrome.check("Java")); // Should print false
    }

}
