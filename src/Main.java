
public class Main {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee employee1 = new FullTimeEmployee("Rahul", 1, 100000);
        PartTimeEmployee employee2 = new PartTimeEmployee("Sachin", 2, 500, 4);
        PartTimeEmployee employee3 = new PartTimeEmployee("Vikas", 3, 300, 5);
        payrollSystem.addEmployee(employee1);
        payrollSystem.addEmployee(employee2);
        payrollSystem.addEmployee(employee3);
        System.out.println("Employee List : ");
        payrollSystem.showEmployee();
        System.out.println("Removing Employee : ");
        payrollSystem.removeEmployee(1);
        System.out.println("Remaining Employee List : ");
        payrollSystem.showEmployee();
    }
}
