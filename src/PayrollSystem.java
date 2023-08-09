import java.util.ArrayList;

public class PayrollSystem {
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
            if (employeeToRemove != null) {
                employeeList.remove(employeeToRemove);
            }
        }
    }

    public void showEmployee() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}