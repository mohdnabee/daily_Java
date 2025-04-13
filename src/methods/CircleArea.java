package methods;

import java.util.Scanner;

public class CircleArea {
    public static void calculateArea() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");

        double radius = scanner.nextDouble();
        double area = 3.14159 * radius * radius;

        System.out.println("The area of the circle is: " + area);
        scanner.close();
    }

    public static void main(String[] args) {

        calculateArea();
    }
}
