package Encapsulation;

class  Employee{
    private  String name ;
    private  double salary;

    public  void setName(String name ){
        this.name = name;
    }

    public  void  setSalary(double salary){
        if (salary >=  0)
            this.salary = salary;
        else
            System.out.println("Invalid salary");
    }

    public  String getName(){
        return name ;
    }

    public double getSalary(){
        return salary;
    }
}

public class EmployeeES {
    public static void main(String[] args) {

        Employee emp =  new Employee();
        emp.setName("Asus");
        emp.setSalary(-100); // Should show error
        emp.setSalary(50000); // Valid

        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());

    }
}
