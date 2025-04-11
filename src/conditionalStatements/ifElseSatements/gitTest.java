package conditionalStatements.ifElseSatements;
import  java.util.*;
public class gitTest {

    public static void main(String[] args) {
        System.out.println("Enter your status:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); // Use nextLine() instead of next()
        String[] words = input.split("\\s+");
        int wordCount = words.length;
        System.out.println("Number of words: " + wordCount);
        sc.close(); // Close the Scanner to prevent resource leaks


    }
}
