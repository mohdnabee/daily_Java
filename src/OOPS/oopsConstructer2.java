package OOPS;

class  StudentInfo {
String name ;
int age ;


public  void printInfo(){
    System.out.println(this.name);
    System.out.println(this.age);
}

//   Parameterized constructor
StudentInfo (String name , int age ){
   this.name = name;
   this.age = age ;
}

}

public class oopsConstructer2 {
    public static void main(String[] args) {
        StudentInfo s1 =  new StudentInfo("Aman", 22);
        s1.printInfo();
    }
}
