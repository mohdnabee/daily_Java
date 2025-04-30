package loops.demo.forLoop.Pattern;

public class QuestionsPaterns {
    public static void main(String[] args) {

        int n= 5;
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


        System.out.println(" Hollow solid rhombus!");


        for (int i = 1 ;  i<=5;  i++){


            for (int j = 1 ; j<=i ; j++){
                System.out.print(" ");
            }

            for (int j = 1 ; j<=5 ; j++){
                if (i==n || j== n || i==1|| j==1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("Invert solid rhombus");


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




        System.out.println(" Inverted Hollow Solid Rhombus");

        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=n; j++) {
                if (i==n || j== n || i==1|| j==1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }


    }
}



