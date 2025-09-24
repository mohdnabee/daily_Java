import java.util.Scanner;

public class Pratice_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();

        if (age <= 10) {
            System.out.println("You are a kid.");
        } else if (age >= 11 && age <= 17) {
            System.out.println("You are a teen.");
        } else if (age >= 18 && age <= 45) {
            System.out.println("Welcome, you are an adult.");
        } else {
            System.out.println("You Are Old take care");
        }
    }

}
