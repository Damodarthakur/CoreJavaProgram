package streamApiPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeHighestSalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "John",32,"male","Hr",25000),
                new Employee(2, "Jane",30,"female","Manager",35000),
                new Employee(3, "Alice",32,"female","Sales manager",55000)
        );
        System.out.println("-------By using ForEach-------------");
        employees.stream()
                .forEach(System.out::println);

        List<Employee> iteratingList = employees.stream().map(e->e).collect(Collectors.toList());
        System.out.println("iteratingList :"+'\n'+iteratingList);

        Optional<Employee> emp = employees.stream()
                .max(Comparator.comparing(Employee::getSalary));

        if (emp.isPresent()) {
            Employee highestPaidEmployee = emp.get();
            System.out.println("Name: " + highestPaidEmployee.getName() +
                    " Salary: " + highestPaidEmployee.getSalary());
        } else {
            System.out.println("No employee in the list");
        }

    }
}
