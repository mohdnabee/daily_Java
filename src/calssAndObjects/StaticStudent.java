package calssAndObjects;
//13.	Create a class named Student with a static variable school_name and an instance variable name.
// Create 2 objects and print the school name and student names.
public class StaticStudent {

     static  String school_name ;

    public static void main(String[] args) {

        StaticStudent.school_name= "MODEL HIGH SCHOOL";

        System.out.println("School Name : "+ StaticStudent.school_name);
    }

}
