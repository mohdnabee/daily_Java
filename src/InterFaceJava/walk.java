package InterFaceJava;

///  . Create two interfaces Walkable and Runnable.
/// Each should have a method: walk() and run() respectively.
/// Then, create a class Human that implements both interfaces and defines both methods.
/// Create a main method where an object of Human is created and both methods are called.


interface Walkable {
    void walk();
}

interface Runnable {
    void run();
}

class Human implements Walkable, Runnable {
    public void walk() {
        System.out.println("Walking ");
    }

    public void run() {
        System.out.println("running");
    }
}

public class walk {
    public static void main(String[] args) {
        Human human = new Human();
        human.walk();
        human.run();
    }
}