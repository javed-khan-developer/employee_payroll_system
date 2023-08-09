import java.util.ArrayList;

class PayrollSystem {
    private ArrayList<Employee> employeeList;

    public PayrollSystem() {
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(int id) {
        Employee employeeToRemove = null;
        for (Employee employee : employeeList) {
            if (employee.getEmployeeId() == id) {
                employeeToRemove = employee;
                break;
            }
        }
        if (employeeToRemove != null) {
            employeeList.remove(employeeToRemove);
        }
    }

    public void showEmployee() {
        for (Employee employee : employeeList) {
            System.out.println("Employee[name : " + employee.getEmployeeName() + ", id : " + employee.getEmployeeId()
                    + ", salary: " +
                    employee.calculateSalary() + "]");
        }
    }

    public double calculateTotalSalary() {
        double totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.calculateSalary();
        }
        return totalSalary;
    }
}
