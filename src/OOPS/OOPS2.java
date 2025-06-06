package OOPS;

class  Student {
    String name ;
    int age ;


    public  void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class OOPS2 {
    public static void main(String[] args) {

        Student s1 =  new Student();
        s1.name = "Nabeel";
        s1.age = 22 ;

        s1.printInfo();
    }
}
