package ExceptionHAndling;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {

        Scanner  sc =  new Scanner(System.in);
        System.out.print("enter The value of a : ");
        int a = sc.nextInt();
        System.out.print("enter The value of b : ");
        int b = sc.nextInt();

        try {
          int   c = a/ b ;
            System.out.println(c);
        }catch (Exception e){
            System.out.println(e);

        }
        System.out.println("User Input ");
        System.out.println("Exception Handling Example");
    }
}
