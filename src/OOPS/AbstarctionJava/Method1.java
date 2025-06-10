package OOPS.AbstarctionJava;
// method one Abstract Class
abstract class Animal{
    abstract void walk ();
    //  constructor
    Animal(){
        System.out.println("You are creating a new Animal");
    }

    public void eat(){
        System.out.println("animals eats");
    }
}
//=================================================================

class  Horse extends Animal{

    //  //  constructor
    Horse(){
        System.out.println("Created a Horse");
    }

    public void walk(){


        System.out.println("Walks on 4 legs");
    }
}
//=============================================================

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}
//===============================================================
public class Method1 {
    public static void main(String[] args) {

        Horse horse = new Horse();
//        horse.walk();
//        horse.eat();

//        Animal animal =  new Animal();
//        animal.walk();
    }
}
