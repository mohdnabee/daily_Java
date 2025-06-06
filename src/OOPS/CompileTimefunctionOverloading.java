package OOPS;
//  function overloading

class Person{
    String name ;
    int age ;

    public  void printInfo(String name ){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name , int age ){
        System.out.println(name + " " +age);
    }

}

public class CompileTimefunctionOverloading {
    public static void main(String[] args) {

        Person p1 =  new Person();
        p1.name=  "Nabeel";
        p1.age=  22;

        p1.printInfo(p1.name,p1.age);

    }
}
