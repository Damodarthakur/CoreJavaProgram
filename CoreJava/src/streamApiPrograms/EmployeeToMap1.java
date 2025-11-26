package streamApiPrograms;


import java.util.*;
import java.util.stream.Collectors;

public class EmployeeToMap1 {
    private int employeeId;
    private String employeeName;
    private String department;
    private double salary;
    private int age;
    private String city;

    public EmployeeToMap1(int employeeId, String employeeName, String department, double salary, int age) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
        this.age = age;
    }

    public EmployeeToMap1(int employeeId, String alice, String london) {
    }

    public EmployeeToMap1(String bob, String paris) {
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public static void main(String[] args) {
        List<EmployeeToMap1> employees = new ArrayList<>();
        employees.add(new EmployeeToMap1(1, "John Doe", "IT", 5000, 30));
        employees.add(new EmployeeToMap1(2, "Jane Smith", "HR", 6000, 35));
        employees.add(new EmployeeToMap1(3, "Michael Johnson", "Finance", 7000, 40));

        Map<Integer, EmployeeToMap1> employeeMap = employees.stream()
                .collect(Collectors.toMap(EmployeeToMap1::getEmployeeId, employee -> employee));

        // Print the HashMap
        employeeMap.forEach((employeeId, employee) -> System.out.println("Employee ID: " + employeeId + ", Employee Name: " + employee.getEmployeeName()));
    }


}

