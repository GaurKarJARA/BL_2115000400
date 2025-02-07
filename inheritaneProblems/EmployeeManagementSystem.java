class Employee {
    private String id;
    private String name;
    private double salary;
    public Employee() {
        this.id = "0";
        this.name = "not found";
        this.salary = 0.0;
    }

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println();
        System.out.printf("Employee Id: %s\n", id);
        System.out.printf("Employee Name: %s\n", name);
        System.out.printf("Employee Salary: %.2f\n", salary);
    }
}

class Developer extends Employee {
    private String programmingLanguage;
    
    public Developer() {
        super();
        this.programmingLanguage = "Unknown";
    }
    
    public Developer(String id, String name, double salary) {
        super(id, name, salary);
        this.programmingLanguage = "Unknown";
    }
    
    public Developer(String id, String name, double salary, String programmingLanguage) {
        super(id, name, salary);
        this.programmingLanguage = programmingLanguage;
    }
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.printf("Programming Language: %s\n", programmingLanguage);
    }
}
class Manager extends Employee {
    private int teamSize;

    public Manager() {
        super();
        this.teamSize = 0;
    }

    public Manager(String id, String name, double salary) {
        super(id, name, salary);
        this.teamSize = 0;
    }

    public Manager(String id, String name, double salary, int teamSize) {
        super(id, name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.printf("Team Size: %d\n", teamSize);
    }
}

class Intern extends Employee {
    private int durationInMonths;

    public Intern() {
        super();
        this.durationInMonths = 0;
    }

    public Intern(String id, String name, double salary) {
        super(id, name, salary);
        this.durationInMonths = 0;
    }

    public Intern(String id, String name, double salary, int durationInMonths) {
        super(id, name, salary);
        this.durationInMonths = durationInMonths;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.printf("Duration in Months: %d\n", durationInMonths);
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee employee = new Employee("1234", "gaurav", 100000.0);
        employee.displayDetails();
        
        Manager manager = new Manager("1999", "someone", 600000.0, 5);
        manager.displayDetails();
        
        Developer developer = new Developer("111", "tbone", 70000.0, "Java");
        developer.displayDetails();
        
        Intern intern = new Intern("21", "mickle", 30000.0, 6);
        intern.displayDetails();
    }
}
