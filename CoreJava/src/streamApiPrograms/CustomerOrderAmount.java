package streamApiPrograms;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Customer {
    private int id;
    private String name;
    private String address;
    private double orderAmount;

    public Customer(int id, String name, String address, double orderAmount) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.orderAmount = orderAmount;
    }

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", orderAmount=" + orderAmount + "]";
	}
}

public class CustomerOrderAmount {
    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(
                new Customer(1, "John", "123 Main St", 15000),
                new Customer(2, "Alice", "456 Elm St", 8000),
                new Customer(3, "Bob", "789 Oak St", 20000),
                new Customer(4, "Eve", "321 Pine St", 12000)
        );

        // Find customers with orderAmount greater than 10000 and apply 10% discount
		/*
		 * customers.stream() .filter(customer -> customer.getOrderAmount() > 10000)
		 * .forEach(customer -> { double discountedAmount = customer.getOrderAmount() *
		 * 0.9; customer.setOrderAmount(discountedAmount); });
		 * 
		 * // Print the updated order amounts of customers for (Customer customer :
		 * customers) { System.out.println("Customer " + customer.getId() + ": " +
		 * customer.getOrderAmount()); }
		 */
        List<Double> orderAmnt = customers.stream().filter(cust-> cust.getOrderAmount()>10000)
        		.map(cust-> cust.getOrderAmount()-(cust.getOrderAmount()*0.1)) //Subtracts the 10% discount from the original amount.
        		.collect(Collectors.toList());
        //double discountAmount = .getOrderAmount()*0.1;
        System.out.println(orderAmnt);
        orderAmnt.forEach(System.out::println);
        
    }
}

