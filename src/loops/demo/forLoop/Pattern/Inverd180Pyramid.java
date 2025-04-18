package loops.demo.forLoop.Pattern;

public class Inverd180Pyramid {

    public static void main(String[] args) {

        int n = 5;

        // outer loop
        for (int i=1 ;  i<=n; i++){

            // inner loop for print space
            for (int j =1; j<=n-i; j++){
                System.out.print(" ");
            }

            // inner loop for print *
            for (int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
