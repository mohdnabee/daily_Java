package loops.demo.forLoop.Pattern;

public class Hexagon_Pattern {
    public static void main(String[] args) {
        int size = 4;  // height of top/bottom triangle

        // Top half
        for (int i = 0; i < size; i++) {
            // spaces before stars
            for (int j = 0; j < size - i; j++)
                System.out.print(" ");
            // stars
            for (int j = 0; j < size + 2 * i; j++)
                System.out.print("*");
            System.out.println();
        }

        // Bottom half
        for (int i = size - 2; i >= 0; i--) {
            // spaces before stars
            for (int j = 0; j < size - i; j++)
                System.out.print(" ");
            // stars
            for (int j = 0; j < size + 2 * i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
