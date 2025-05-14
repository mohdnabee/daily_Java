package Polymorphism;
// // Create a class that has overloaded methods for displaying the area of different shapes.

class Shape{

    double circle(int radius)
    {
        return (3.14 * radius*radius);

    }

    int square (int side){
        return side*side;
    }

    int rectangle(int lenght, int width){
        return lenght*width;
        // area of the rectangle is = length * width
    }

    int Parallelogram(int base , int height){
        // Parallelogram: Area = base * height
        return base * height;
    }

}

public class areaOfShapes {
    public static void main(String[] args) {
        Shape obj = new Shape();

        System.out.println("Area of circle: "+obj.circle(20));
        System.out.println("Area of Square: "+obj.square(5));
        System.out.println("Area of retangle: "+obj.rectangle(4,3));
        System.out.println("Area of parallelogram: "+obj.Parallelogram(3,3));


    }
}
