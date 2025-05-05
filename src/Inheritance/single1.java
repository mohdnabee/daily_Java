package Inheritance;

class Employee{
    void work(){
        System.out.println("Employee is working.... ");
    }
}

// class inherit kar ne ke liye extends ka use hota ha
class Manager extends Employee{
    void attendMeeting(){
        System.out.println("Manager is attending a meeting.....");
    }
}

public class single1 {

    public static void main(String[] args) {
        Manager obj =  new Manager();
        obj.attendMeeting();
        obj.work();

    }
}
