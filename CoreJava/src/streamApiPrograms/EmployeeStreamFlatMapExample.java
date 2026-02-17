package streamApiPrograms;

import java.util.Arrays;
import java.util.List;

public class EmployeeStreamFlatMapExample {
	 public static void main(String[] args) {
	        List<List<EmployeeToMap1>> employees = Arrays.asList(
	                Arrays.asList(
	                        new EmployeeToMap1(11,"John", "New York"),
	                        new EmployeeToMap1(12,"Alice", "London")
	                ),
	                Arrays.asList(
	                        new EmployeeToMap1(14,"Bob", "Paris"),
	                        new EmployeeToMap1(15,"Jane", "Tokyo")
	                )
	        );

	        employees.stream()
	                .flatMap(List::stream)
	                .forEach(employee -> System.out.println("Name: " + employee.getEmployeeName() + ", City: " + employee.getCity()));
	    }

}


