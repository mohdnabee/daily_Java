package loops.demo.forLoop.Pattern;
import java.util.*;

public class solidRecatngle {
    public static void main(String[] args) {
        // print the retangle
//        ******  rows = 4 , columns = 5
//        ******
//        ******  using a for loop
        System.out.println("A SOLID RECTANGLE");

        // nested loop means outer loop and inner loop (YA 1 LOOP ME MULTIPLE LOOP )
        // ITS MEANS ONE LOOP INSIDE A SECOND LOOP

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the rows");
        int a = sc.nextInt();

        System.out.println("enter the columns");
        int b = sc.nextInt();

        System.out.println(a + "X" + b +"rectangle");

           // outer loop
        for (int i = 1;i <=a ; i++){

         // inner loop
            for (int j = 1 ; j <=b ; j++){

                System.out.print("*");
            }

            System.out.println();
        }

    }

}