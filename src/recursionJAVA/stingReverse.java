package recursionJAVA;

import java.util.Scanner;

public class stingReverse {

    // Recursive function to check if a string is palindrome
    public static boolean isPalindrome(String str, int start, int end) {
        // Base case: if start >= end, it's a palindrome
        if (start >= end) {
            return true;
        }

        // If characters don't match, not a palindrome
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Move towards the center
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print(" Enter the one word of a String :  ");
        String str1 = sc.next();
        String str2 = "hello";


        System.out.println(str1 + " → " + isPalindrome(str1, 0, str1.length() - 1));
        System.out.println(str2 + " → " + isPalindrome(str2, 0, str2.length() - 1));
    }
}
