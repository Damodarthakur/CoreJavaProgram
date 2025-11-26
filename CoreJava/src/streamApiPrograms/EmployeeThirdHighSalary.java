package streamApiPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Employee2 {
    private int id;
    private String name;
    private int age;
    private int salary;

    public Employee2(int id, String name, int age, int salary) {
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

    public int getSalary() {
        return salary;
    }
}

public class EmployeeThirdHighSalary {
	public static void main(String[] args) {
        // Create a list of employees
        List<Employee2> employees = Arrays.asList(
                new Employee2(1, "John Doe", 30, 50000),
                new Employee2(2, "Jane Smith", 25, 60000),
                new Employee2(3, "Robert Johnson", 35, 70000),
                new Employee2(4, "Emily Davis", 28, 55000),
                new Employee2(5, "Michael Brown", 32, 80000)
        );

        // Find the 3rd highest salary
        /*
       Optional<Integer> thirdHighestSalary = employees.stream()
                .map(Employee2::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst();

         */

        Optional<Employee2> thirdHighestSalary = employees.stream()
                        .sorted(Comparator.comparingDouble(Employee2::getSalary)
                                .reversed()).skip(2).findFirst();

        System.out.println("The third highest salary is: " + thirdHighestSalary);
    }
}


