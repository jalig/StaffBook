public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванова В.А.", 1, 25168);
        employees[1] = new Employee("Матвеев Т.К.", 2, 29382);
        employees[2] = new Employee("Мышкина Н.Н.", 3, 26216);
        employees[3] = new Employee("Семёнов М.Д.", 4, 26386);
        employees[4] = new Employee("Костина В.М.", 5, 26853);
        employees[5] = new Employee("Миронов К.А.", 1, 27498);
        employees[6] = new Employee("Беляков С.А.", 2, 27712);
        employees[7] = new Employee("Дьякова А.Д.", 3, 27919);
        employees[8] = new Employee("Спирина В.С.", 4, 29030);
        employees[9] = new Employee("Потапов Л.С.", 5, 29366);
        System.out.println(EmployeeMethods.maxSalary(employees));
    }

}
