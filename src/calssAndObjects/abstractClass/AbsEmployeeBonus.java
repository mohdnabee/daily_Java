package calssAndObjects.abstractClass;

//Create an abstract class Employee with fields name, salary, and an abstract method calculateBonus().
// Extend it in a class Manager that calculates bonus as 20% of salary

abstract class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    // Abstract method
    abstract void calculateBonus();
}

// Subclass
class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }


    void calculateBonus() {
        double bonus = salary * 0.20;
        System.out.println("Manager Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
    }
}


public class AbsEmployeeBonus {
    public static void main(String[] args) {

        Manager manager =new Manager("Mohd Nabeel", 50000);
        manager.calculateBonus();
    }
}
