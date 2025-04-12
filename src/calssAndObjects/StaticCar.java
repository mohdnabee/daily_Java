package calssAndObjects;
// 14.	Create a class named Car with a static variable wheels and an instance variable color.
// Assign values to both and print them
public class StaticCar {

    static  int wheels = 4;
    String colors ;

    public static void main(String[] args) {
        StaticCar car = new StaticCar();
        car.colors = "Red";

        System.out.println("Number of wheels: " + StaticCar.wheels);
        System.out.println("Car color: " + car.colors);
    }

    }
