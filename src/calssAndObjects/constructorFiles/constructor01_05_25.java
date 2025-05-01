package calssAndObjects.constructorFiles;


class  students {
    // Create a class attribute ========================//====================================================//========
    String firstname ="Rahul";
    int age =  11 ;


    // Create a class constructor for the students class ==============================//==========================//===
    students(String s , int a){
        firstname= s;
        age = a;

        System.out.println(firstname + " "+age);
    }

}


public class constructor01_05_25 {
    public static void main(String[] args) {
// // Create an object of class Main (This will call the constructor) ==================//==============================
        students one =  new students("Nabeel", 21);
        students two =      new students("Raj",22);
        students three = new students("ketan", 20);


    }

}
/** A constructor in Java is a special method that is used to initialize objects. The constructor is called when an
object of a class is created. It can be used to set initial values for object attributes



 Note: - that the constructor name must match the class name, and it cannot have a return type (like void).

 Also note that the constructor is called when the object is created.

 All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you. However,
 then you are not able to set initial values for object attributes.
 */