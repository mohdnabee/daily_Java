package loops.demo.forLoop.Pattern;

public class halfPyramid {
    public static void main(String[] args) {

        System.out.println("Half Pyramid");
        System.out.println();

        int a = 5;
        for (int i =1 ; i<=a; i++){

            for (int j = 1 ; j <=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println(" inverse half pyramid ");
        System.out.println();

     int b = 5 ;

     for (int i = b ;  i>= 1 ; i--){

         for (int j = 1; j<=i; j++){
             System.out.print("@");
         }
         System.out.println();
     }

    }
}
