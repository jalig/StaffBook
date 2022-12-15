public class Main {
    public static Employee[] employees = new Employee[10];
    public static void main(String[] args) {
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
    }
    //1. Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
    public static void printAllEmployeeData() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    //2. Посчитать сумму затрат на зарплаты в месяц.
    public static StringBuilder amountOfSalaries() {
        StringBuilder result = new StringBuilder();
        int sum = 0;
        result.append("Сумма всех зарплат: ");
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return result.append(sum).append(" руб.");
    }
    //3. Найти сотрудника с минимальной зарплатой.
    public static Employee maxSalary () {
        Employee max = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > max.getSalary()) {
                max = employees[i];
            }
        }
        return max;
    }
    //4. Найти сотрудника с максимальной зарплатой.
    public static Employee minSalary () {
        Employee min = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < min.getSalary()) {
                min = employees[i];
            }
        }
        return min;
    }
    //5. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
    public static StringBuilder averageSalary () {
        StringBuilder average = new StringBuilder();
        int sum = 0;
        average.append("Средняя зарплата: ");
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        int averageSalary = sum / employees.length;
        return average.append(averageSalary).append(" руб.");
    }
    //6. Получить Ф. И. О. всех сотрудников (вывести в консоль).
    public static void printAllEmployeeFullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}
