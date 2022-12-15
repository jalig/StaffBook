public class Employee {
    private String fullName;
    private int department;
    private int salary;
    private static int counter;
    private int id;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = ++counter;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public float getSalary() {return salary;}

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Ф.И.О: " + fullName + "\nОтдел №" + department + "\nЗарплата: " + salary;
    }
}
