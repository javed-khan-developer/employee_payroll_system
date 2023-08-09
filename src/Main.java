
public class Main {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee employee1 = new FullTimeEmployee("Rahul", 1, 100000);
        PartTimeEmployee employee2 = new PartTimeEmployee("Sachin", 2, 500, 4);
        PartTimeEmployee employee3 = new PartTimeEmployee("Vikas", 3, 300, 5);
        FullTimeEmployee employee4 = new FullTimeEmployee("Kaif Khan", 4, 50000);
        // for adding employees
        payrollSystem.addEmployee(employee1);
        payrollSystem.addEmployee(employee2);
        payrollSystem.addEmployee(employee3);
        payrollSystem.addEmployee(employee4);
        System.out.println("Employee List : ");
        // for all employees details
        payrollSystem.showEmployee();
        System.out.println("Removing Employee : ");
        // remove employee by Id
        payrollSystem.removeEmployeeById(1);
        System.out.println("Remaining Employee List : ");
        payrollSystem.showEmployee();
        // total salary of all employees
        System.out.println("total salary : " + payrollSystem.calculateTotalSalary());
        // find the employee by id
        Employee findEmployee = payrollSystem.findEmployeeById(4);
        System.out.println("employee found with id : " + findEmployee.getEmployeeId() + " Name is: "
                + findEmployee.getEmployeeName());
        // update the employee by passing new name and id
        Employee updatedEmployee = payrollSystem.updateEmployeeName(4, "Javed Khan");
        System.out.println("the employee with updated name is :" + updatedEmployee.getEmployeeName() + " with id : "
                + updatedEmployee.getEmployeeId());
        payrollSystem.showEmployee();
    }
}
