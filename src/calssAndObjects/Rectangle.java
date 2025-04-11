package calssAndObjects;

//Q4.	Create a class named Rectangle with instance variables length and width.
// Create an object and assign values to these variables. Print the area of the rectangle

public class Rectangle {

    double length;
    double width;

    public double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.length = 15.0;
        rectangle.width = 8.0;

        double area = rectangle.calculateArea();
        System.out.println("Area of the rectangle: " + area);
    }

}
