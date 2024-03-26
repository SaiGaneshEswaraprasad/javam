class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;
}

class Manager extends Member {
    String department;
}

public class Main {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee();
        emp.name = "John";
        emp.age = 30;
        emp.phoneNumber = "123-456-7890";
        emp.address = "123 Main St";
        emp.salary = 50000.0;
        emp.specialization = "Software Development";

        // Creating a Manager object
        Manager mgr = new Manager();
        mgr.name = "Jane";
        mgr.age = 35;
        mgr.phoneNumber = "987-654-3210";
        mgr.address = "456 Elm St";
        mgr.salary = 80000.0;
        mgr.department = "Human Resources";

        // Printing employee details
        System.out.println("Employee Details:");
        System.out.println("Name: " + emp.name);
        System.out.println("Age: " + emp.age);
        System.out.println("Phone Number: " + emp.phoneNumber);
        System.out.println("Address: " + emp.address);
        emp.printSalary(); // Using the printSalary method

        System.out.println(); // Blank line for separation

        // Printing manager details
        System.out.println("Manager Details:");
        System.out.println("Name: " + mgr.name);
        System.out.println("Age: " + mgr.age);
        System.out.println("Phone Number: " + mgr.phoneNumber);
        System.out.println("Address: " + mgr.address);
        mgr.printSalary(); // Using the printSalary method
    }
}
