public class EmployeeMethods {
    //1. Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
    public static void printAllEmployeeData(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    //2. Посчитать сумму затрат на зарплаты в месяц.
    public static StringBuilder amountOfSalaries(Employee[] employees) {
        StringBuilder result = new StringBuilder();
        int sum = 0;
        result.append("Сумма всех зарплат: ");
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return result.append(sum).append(" руб.");
    }

    //3. Найти сотрудника с минимальной зарплатой.
    public static Employee maxSalary (Employee[] employees) {
        Employee max = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (max == null || employees[i].getSalary() > max.getSalary()) {
                max = employees[i];
            }
        }
        return max;
    }

    //4. Найти сотрудника с максимальной зарплатой.
    public static Employee minSalary (Employee[] employees) {
        Employee min = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < min.getSalary()) {
                min = employees[i];
            }
        }
        return min;
    }
    //5. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
    public static StringBuilder averageSalary (Employee[] employees) {
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
    public static void printAllEmployeeFullNames(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}
