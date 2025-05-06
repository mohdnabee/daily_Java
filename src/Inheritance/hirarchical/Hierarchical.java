package Inheritance.hirarchical;


class Animal{
    void eat(){
        System.out.println("It eats meat");
    }
    void sleep(){
        System.out.println("It sleeps at Night");
    }
}
class Dog extends Animal{
    void speak(){
        System.out.println("Wooff");
    }
}
class Cat extends Animal{
    void speak(){
        System.out.println("Meoww");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("Fling");
    }
}
public class Hierarchical{

    public static void main(String[] args) {
        Dog obj1 = new Dog();
        obj1.speak();
        obj1.eat();
        obj1.sleep();

        Cat obj2 = new Cat();
        obj2.speak();
        obj2.eat();
        obj2.sleep();

        Bird obj3 = new Bird();
        obj3.fly();
        obj3.eat();
        obj3.sleep();
    }
}
