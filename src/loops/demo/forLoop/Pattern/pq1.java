package loops.demo.forLoop.Pattern;

public class pq1 {

    public static void main(String[] args) {


        int n = 5;

        // Print the upper half of the diamond
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Print the lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}