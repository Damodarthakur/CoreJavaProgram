package streamApiPrograms;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeSortingById {
    private int id;
    private String name;
    private String mobileNumber;
    private String address;

    // constructor, getters, setters

    public static void main(String[] args) {
        List<EmployeeSortingById> employees = new ArrayList<>();
        employees.add(new EmployeeSortingById(2, "John Doe", "1234567890", "Address 2"));
        employees.add(new EmployeeSortingById(1, "Jane Smith", "0987654321", "Address 1"));
        employees.add(new EmployeeSortingById(3, "Alice Johnson", "9876543210", "Address 3"));

        // Sorting employees by ID
        List<EmployeeSortingById> sortedEmployees = employees.stream()
                .sorted(Comparator.comparingInt(EmployeeSortingById::getId))
                .toList();

        // Print sorted employees
        sortedEmployees.forEach(emp -> System.out.println(emp.getId() + ": " + emp.getName()));
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public EmployeeSortingById(int id, String name, String mobileNumber, String address) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.address = address;
	}

	@Override
	public String toString() {
		return "EmployeeSortingById [id=" + id + ", name=" + name + ", mobileNumber=" + mobileNumber + ", address="
				+ address + "]";
	}
	
}

