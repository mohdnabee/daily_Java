package Encapsulation;

class  Student {
    private String name ;
    private  int age ;

    //  setter method
    public  void setName(String name ){
        this.name=  name ;
    }

    public  void setAge (int age){
        this.age =  age ;
    }

     //  Getter method
    public String getName(){
        return name ;
    }

    public int getAge(){
        return age ;
    }

}

public class studentsNameAge {
    public static void main(String[] args) {

        Student student =  new Student();
        student.setName("Mohd NAbeel");
        student.setAge(21);

        System.out.println("Name : " +student.getName());
        System.out.println("Age : "+ student.getAge());


    }
}
