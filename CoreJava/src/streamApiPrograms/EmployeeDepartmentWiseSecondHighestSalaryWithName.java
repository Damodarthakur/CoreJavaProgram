package streamApiPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDepartmentWiseSecondHighestSalaryWithName {
    public static void main(String[] args) {
        List<EmployeeEntity> emplist = Arrays.asList(
                new EmployeeEntity("Alice", "Female", "IT", 75000),
                new EmployeeEntity("Bob", "Male", "HR", 50000),
                new EmployeeEntity("Bob", "Male", "HR", 70000),
                new EmployeeEntity("Carol", "Female", "Finance", 80000),
                new EmployeeEntity("Carol", "Female", "Finance", 90000),
                new EmployeeEntity("Carol", "Female", "Finance", 60000),
                new EmployeeEntity("David", "Male", "IT", 90000),
                new EmployeeEntity("Eve", "Female", "IT", 72000)
        );
        Map<String, EmployeeEntity> result =
                emplist.stream()
                        .collect(Collectors.groupingBy(
                                EmployeeEntity::getDepartment,
                                Collectors.collectingAndThen(
                                        Collectors.toList(),
                                        (List<EmployeeEntity> list) -> list.stream()
                                                .sorted(Comparator.comparing(EmployeeEntity::getSalary)
                                                        .reversed())
                                                .skip(1)        // skip highest
                                                .findFirst()    // take second highest
                                                .orElse(null)
                                )
                        ));

        result.forEach((department, employee) -> {
            if (employee != null) {
                System.out.println(
                        "departmenName :"+department +", Name: " +
                                employee.getName() +
                                ", Salary: " +
                                employee.getSalary()
                );
            }
        });


    }
}
