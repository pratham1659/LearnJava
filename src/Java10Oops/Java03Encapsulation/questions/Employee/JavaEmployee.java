package Java10Oops.Java03Encapsulation.questions.Employee;

class JavaEmployee {
//    Define a class Employee with private attributes (like name, age,
//    and salary), public methods to get and set these attributes, and a
//    package-private method to displayEmployeeDetails. Create
//    another class in the same package to test access to the
//    displayEmployeeDetails method.

    private int employeeId;
    private String name;
    private double salary;
    private String department;

    // Constructor
    public JavaEmployee(int employeeId, String name, double salary, String department) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // Getter methods
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    // Setter method for salary (with validation)
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary. Salary cannot be negative.");
        }
    }

    // Method to give a salary raise
    public void giveRaise(double raiseAmount) {
        if (raiseAmount >= 0) {
            salary += raiseAmount;
            System.out.println("Salary raised by " + raiseAmount);
        } else {
            System.out.println("Invalid raise amount. Raise amount must be non-negative.");
        }
    }

    // Method to display employee information
    public void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("Department: " + department);
    }

    // Main method for testing
    public static void main(String[] args) {
        JavaEmployee employee = new JavaEmployee(101, "Alice", 50000.0, "Engineering");
        employee.display(); // Display initial employee information
        employee.giveRaise(5000.0); // Give a raise of $5000
        employee.setSalary(55000.0); // Set salary directly
        System.out.println();
        employee.display(); // Display updated employee information
    }
}
