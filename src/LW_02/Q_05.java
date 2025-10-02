package LW_02;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Q_05 {
    private static boolean isPalindrome(String cleaned) {
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    private static String normalizeWord(String word) {

        return word.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence to test for palindrome:");
        String inputLine = scanner.nextLine();
        scanner.close();

        StringTokenizer tokenizer = new StringTokenizer(inputLine);
        StringBuilder cleanedBuilder = new StringBuilder();

        while (tokenizer.hasMoreTokens()) {
            String rawWord = tokenizer.nextToken();
            String normWord = normalizeWord(rawWord);
            cleanedBuilder.append(normWord);
        }

        String cleaned = cleanedBuilder.toString();

        if (cleaned.isEmpty()) {
            System.out.println("The sentence contains no alphanumeric characters.");
        } else if (isPalindrome(cleaned)) {
            System.out.println("The sentence IS a palindrome.");
        } else {
            System.out.println("The sentence is NOT a palindrome.");
        }
    }
}
