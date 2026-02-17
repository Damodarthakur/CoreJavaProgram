package streamApiPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDepartmentWiseSalary {
    public static void main(String[] args) {
        List<EmployeeEntity> employees = Arrays.asList(
                new EmployeeEntity("Alice", "Female", "IT", 75000),
                new EmployeeEntity("Bob", "Male", "HR", 50000),
                new EmployeeEntity("Carol", "Female", "Finance", 80000),
                new EmployeeEntity("David", "Male", "IT", 90000),
                new EmployeeEntity("Eve", "Female", "IT", 72000)
        );

        //1 >***************  female IT department employee with salary :     ------------->"
        System.out.println("female IT department employee with salary :     ------------->" );

        Map<String,Double> strMap = employees.stream().filter(emp-> emp.getGender().equals("Female") && emp.getDepartment().equals("IT"))
                .collect(Collectors.toMap(EmployeeEntity::getName,EmployeeEntity::getSalary));

        strMap.forEach((name,salary)-> System.out.println("name : "+name+ " ,salary :"+salary));


        System.out.println("--------------------------------------------");
        //***********all female employees grouped by department with their salaries:" ********************

        System.out.println("all female employees grouped name with department with their salaries:");


        Map<String, Map<String, Double>> femaleDeptWise = employees.stream()
                .filter(emp -> emp.getGender().equalsIgnoreCase("Female"))
                .collect(Collectors.groupingBy(
                        EmployeeEntity::getDepartment, // group by department
                        Collectors.toMap(EmployeeEntity::getName, EmployeeEntity::getSalary) // inside each dept → name:salary
                ));

        femaleDeptWise.forEach((dept, empMap) -> {
            System.out.println("Department: " + dept);
            empMap.forEach((name, salary) ->
                    System.out.println("   " + name + " : " + salary));
        });
        System.out.println(femaleDeptWise);
        System.out.println("--------------------------------------------");

        //********all  employees grouped by name with department and their salaries:"**********************
        System.out.println("all  employees grouped by name with department and their salaries:");
       Map<String,Map<String, Double>>  allEmpWithDepnSalary = employees.stream()
                            .collect(Collectors.groupingBy(EmployeeEntity::getName
                                    ,Collectors.toMap(EmployeeEntity::getDepartment,EmployeeEntity::getSalary)));
        //System.out.println(allEmpWithDepnSalary);
        allEmpWithDepnSalary.forEach((name,empmap)->{
            System.out.println("name : "+name);
            empmap.forEach((DepartName,Salary)->System.out.println("DepartName :"+DepartName+"Salary: "+Salary));
        });



    }
}
