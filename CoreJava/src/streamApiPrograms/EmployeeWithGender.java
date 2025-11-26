package streamApiPrograms;

 
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employeee {
    private int id;
    private String name;
    private double salary;
    private String gender;

    public Employeee(int id, String name, double salary, String gender) {
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

public class EmployeeWithGender {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employeee> employees = new ArrayList<>();
        employees.add(new Employeee(1, "John", 5000, "Male"));
        employees.add(new Employeee(2, "Jane", 6000, "Female"));
        employees.add(new Employeee(3, "Mike", 5500, "Male"));
        employees.add(new Employeee(4, "Emily", 6500, "Female"));
        employees.add(new Employeee(5, "David", 4500, "Male"));

        // Filter employees based on gender
        List<Employeee> maleEmployees = employees.stream()
                .filter(employee -> employee.getGender().equals("Male"))
                .collect(Collectors.toList());

        // Print the names and IDs of male employees
        maleEmployees.forEach(employee -> System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName()));
    }
}

