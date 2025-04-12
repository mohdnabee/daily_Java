package calssAndObjects;
//2.	Create a class named Car with an instance variable color.
// Create an object of this class and assign the color "Red" to it. Print the color.

public class car {

    String colour ;

    public static void main(String[] args) {

        car car = new car();
        car.colour = "Red";

        System.out.println(car.colour);

    }
}
