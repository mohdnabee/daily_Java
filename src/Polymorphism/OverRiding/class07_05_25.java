package Polymorphism.OverRiding;

//  Create a person class with a display details method that prints basic details (name,age).
// CReate a student class that overrides the display details method to print additional details like grade and school name.

class Person {
    void Details(){
        System.out.println("Name : Mohd Nabeel");
        System.out.println("Age : 021");
    }
}

class  Student extends Person{
    void Details(){
        super.Details();
        System.out.println("Roll no: 0246CS243D13");
        System.out.println("College Name :  Global ");
    }
}

public class class07_05_25 {
    public static void main(String[] args) {
        Person obj = new Student();
        obj.Details();

    }
}
