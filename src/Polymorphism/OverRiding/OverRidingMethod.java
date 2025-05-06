package Polymorphism.OverRiding;

// method overriding
class  Vehicle{
    void run (){
        System.out.println("run ho  ga code");
    }
}
class Bike extends Vehicle{
    void run (){
        System.out.println("New feature add method overriding");
        super.run();   //super keyword used to call parent class.

    }
}

public class OverRidingMethod {
    public static void main(String[] args) {

        Vehicle obj = new Bike();
        obj.run();



    }
}
