package OOPS;

class Studentss{
    String name ;
     static String school ;//  common for all objects

    public static void changeSchool(){
        school =  "NewSchool";
    }
}



public class StaticExample {
    public static void main(String[] args) {
      Studentss.school= "GE";
      Studentss student1 =  new Studentss();
      student1.name="tony";


        System.out.println(student1.school);
    }
}
