package OOPS;

class StudentOOP {
    String name;
    int age;

    public  void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    //  copy constructor
    StudentOOP(StudentOOP s2){
        this.name= s2.name;
        this.age = s2.age;
    }

    StudentOOP(){

    }
}


public class CopyConstrOOp {
    public static void main(String[] args) {

        StudentOOP s1 =  new StudentOOP();
        s1.name=  "Nabeel";
        s1.age = 22;

        StudentOOP s2 = new StudentOOP(s1);
        s2.printInfo();



    }
}
