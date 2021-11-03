package intromethods.employee;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee employee = new Employee("Gergo Galat", 2017, 250_000);

        System.out.println("name: " + employee.getName());
        System.out.println("hiring year: " + employee.getHiringYear());
        System.out.println("salary:" + employee.getSalary() + " Ft.");

        employee.raiseSalary(100_000);

        System.out.println("name: " + employee.getName());
        System.out.println("hiring year: " + employee.getHiringYear());
        System.out.println("salary:" + employee.getSalary() + " Ft.");

        System.out.println(employee.toString());

    }
}
