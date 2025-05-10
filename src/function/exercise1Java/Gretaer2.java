package function.exercise1Java;
import java.util.*;
// write a function which takes a 2 numbers and the returns the greater of those two
public class Gretaer2 {

    //  function
    public  static  void GreaterOF2(int a , int b){
        if (a > b) {
            System.out.println(a + " is greater");
        } else if (b > a) {
            System.out.println(b + " is greater");
        } else {
            System.out.println("Both numbers are equal");
        }

    }


    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);
        // Taking input from the user
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Call the function with user inputs
        GreaterOF2(num1, num2);

    }
}
