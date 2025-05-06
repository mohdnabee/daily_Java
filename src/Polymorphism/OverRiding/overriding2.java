package Polymorphism.OverRiding;

  class Shape{
    void draw(){
        System.out.println("Drawing a shape...");
    }
}

class Circle extends Shape{
    void draw (){
        super.draw();
        System.out.println("Drawing a circle..");
    }
}

class square extends Shape{
    void draw(){
        System.out.println("Drawing a square..");
    }
}

public class overriding2 {
    public static void main(String[] args) {
        Shape obj1 = new Circle();
        Shape obj2 = new square();
        obj1.draw();
        obj2.draw();

    }
}
