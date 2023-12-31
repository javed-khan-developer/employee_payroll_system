abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getEmployeeName() {
        return name;
    }

    public int getEmployeeId() {
        return id;
    }

    public void setEmployeeName(String newName) {
        this.name = newName;
    }

    public abstract double calculateSalary();

}
