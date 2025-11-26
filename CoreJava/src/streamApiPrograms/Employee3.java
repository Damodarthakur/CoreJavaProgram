package streamApiPrograms;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee3 {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee3(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
    public static class EmployeeThirdHiSalary {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee3> employees = Arrays.asList(
                new Employee3(1, "John", 30, 50000.0),
                new Employee3(2, "Jane", 25, 60000.0),
                new Employee3(3, "Mike", 35, 45000.0),
                new Employee3(4, "Sarah", 28, 55000.0),
                new Employee3(5, "David", 32, 70000.0)
        );

        // Use stream API to find the third highest salary
        List<Employee3> result = employees.stream()
                .sorted(Comparator.comparingDouble(Employee3::getSalary).reversed())
                .skip(2)
                .limit(1)
                .collect(Collectors.toList());

        // Print the result
        if (!result.isEmpty()) {
        	Employee3 thirdHighestSalaryEmployee = result.get(0);
            System.out.println("Name: " + thirdHighestSalaryEmployee.getName());
            System.out.println("Salary: " + thirdHighestSalaryEmployee.getSalary());
        } else {
            System.out.println("No employee found.");
        }
    }
}
}
