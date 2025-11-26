package streamApiPrograms;

import java.util.ArrayList;
import java.util.List;

class Employee4 {
    private int id;
    private String name;
    private double salary;
    private String gender;

    public Employee4(int id, String name, double salary, String gender) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getGender() {
        return gender;
    }
}

public class Java7toGetEmpDetaisl {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee4> employees = new ArrayList<>();
        employees.add(new Employee4(1, "John Doe", 5000.0, "Male"));
        employees.add(new Employee4(2, "Jane Smith", 6000.0, "Female"));
        employees.add(new Employee4(3, "Mike Johnson", 5500.0, "Male"));
        employees.add(new Employee4(4, "Emily Brown", 7000.0, "Female"));

        // Find employees with gender Male
        List<Employee4> maleEmployees = new ArrayList<>();
        for (Employee4 employee : employees) {
            if (employee.getGender().equalsIgnoreCase("Male")) {
                maleEmployees.add(employee);
            }
        }

        // Print the details of male employees
        System.out.println("Male Employees:");
        for (Employee4 maleEmployee : maleEmployees) {
            System.out.println("ID: " + maleEmployee.getId() + ", Name: " + maleEmployee.getName());
        }
    }
}
