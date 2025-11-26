package streamApiPrograms;
//convert List of employee into map where key as Id and value as Name

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeListToMap {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "John",32,"male","Hr",25000),
                new Employee(2, "Jane",30,"female","Manager",35000),
                new Employee(3, "Alice",32,"female","Sales manager",55000)
        );

 /*       Map<Integer, String> employeeMap = employees.stream()
                .collect(Collectors.toMap(Employee::getId, Employee::getName));*/
        Map<Integer, String> employeeMap = employees.stream()
                .collect(Collectors.toMap(e->e.getId(), e->e.getName()));

        System.out.println(employeeMap);
    }
}

class Employee {
    private int id;
    private String name;
    private int age;
    private String sex;
    private String Designation;
    private int Salary;

    

	public Employee(int id, String name, int age, String sex, String designation, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		Designation = designation;
		Salary = salary;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	

	

    

	public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

