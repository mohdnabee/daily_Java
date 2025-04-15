package loops.demo.forLoop.Pattern;
import  java.util.*;
public class paternsMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1. Solid Rectangle");
            System.out.println("2. Hollow Rectangle");
            System.out.println("3. Half Pyramid");
            System.out.println("4. Inverse Half Pyramid ");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextShort();

            switch (choice) {
                case 1:
                   soildRecangle();
                    break;
                case 2:
                   hollowRecatngle();
                    break;
                case 3:
                    HalfPyramid();
                    break;
                case 4:
                    inverseHalfPyramid();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public  static  void soildRecangle(){
        System.out.println("A SOLID RECTANGLE");

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

    public  static  void hollowRecatngle(){
        System.out.println("Hollow Rectangle");

        int n=  5;
        int m= 10;

        // outer loop
        for (int i = 1; i<=n;i++){
            //inner loop

            for (int j = 1 ; j<=m ; j++){
                // cell -> (i,j)
                if(i == 1 || j == 1 || i ==n || j==m ){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static  void HalfPyramid(){
        System.out.println("Half Pyramid");
        System.out.println();

        int a = 5;
        for (int i =1 ; i<=a; i++){

            for (int j = 1 ; j <=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public  static  void inverseHalfPyramid(){

        System.out.println(" inverse half pyramid ");
        System.out.println();

        int b = 5 ;
        for (int i = b ;  i>= 1 ; i--)
        {
            for (int j = 1; j<=i; j++)
            {
                System.out.print("@");
            }

            System.out.println();
        }
        System.out.println();
    }

}
