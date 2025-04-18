package loops.demo.forLoop.Pattern;

public class QuestionsPaterns {
    public static void main(String[] args) {

        System.out.println("solid rhombus!");


        for (int i = 1 ;  i<=5;  i++){


            for (int j = 1 ; j<=i ; j++){
                System.out.print(" ");
            }

            for (int j = 1 ; j<=5 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("Invert solid rhombus");
        int n= 5;

        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



