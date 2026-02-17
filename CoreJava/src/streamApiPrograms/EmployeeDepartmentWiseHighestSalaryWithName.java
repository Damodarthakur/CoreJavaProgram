package streamApiPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Optional;


public class EmployeeDepartmentWiseHighestSalaryWithName {
    public static void main(String[] args) {
        List<EmployeeEntity> emplist = Arrays.asList(
                new EmployeeEntity("Alice", "Female", "IT", 75000),
                new EmployeeEntity("Bob", "Male", "HR", 50000),
                new EmployeeEntity("Carol", "Female", "Finance", 80000),
                new EmployeeEntity("David", "Male", "IT", 90000),
                new EmployeeEntity("Eve", "Female", "IT", 72000)
        );
        Map<String, EmployeeEntity> result1 =
                emplist.stream()
                        .collect(Collectors.groupingBy(
                                EmployeeEntity::getDepartment,
                                Collectors.collectingAndThen(
                                        Collectors.maxBy(
                                                Comparator.comparing(EmployeeEntity::getSalary)
                                        ),
                                        Optional::get
                                )
                        ));

        result1.forEach((dept, emp) -> {
            if (emp != null) {
                System.out.println(
                        "Department: " + dept +
                                ", Name: " + emp.getName() +
                                ", Salary: " + emp.getSalary()
                );
            } else {
                System.out.println("Department: " + dept + ", No employee found");
            }
        });



//-------------------------------Secon way----------------------------------------------------------------
        System.out.println("-------------------------------Second way----------------------------------------------------------------");
        Map<String, Map<String,Double>> result =
                emplist.stream()
                        .collect(Collectors.groupingBy(
                                EmployeeEntity::getDepartment,
                                Collectors.collectingAndThen(
                                        Collectors.maxBy(Comparator.comparing(EmployeeEntity::getSalary)),
                                        opt -> {
                                            EmployeeEntity e = opt.get();
                                            return Map.of( e.getName(),e.getSalary());
                                        })));

        System.out.println("only printing result:"+ '\n'+result);
        result.forEach((departname,empmap)->{
            System.out.println("name : "+departname);
            empmap.forEach((EmpName,Salary)->System.out.println("Employee :"+EmpName+"Salary: "+Salary));
        });


    }
}
