package calssAndObjects;
//8.	Create a class named Employee with instance variables name, id, and salary.
// Create 3 objects and assign values to each. Print the details of all employees.
public class Employee {

    String named, salary , id ;

    public static void main(String[] args) {

        Employee worker = new Employee();
        worker.named = "Alex";
        worker.id= "0246CS243d13";
        worker.salary= "100000";

        System.out.println("Name : "+worker.named);
        System.out.println("id : " +worker.id);
        System.out.println("Salary : "+worker.salary);
    }
}
