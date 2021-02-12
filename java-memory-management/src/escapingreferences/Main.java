package escapingreferences;

public class Main {

	public static void main(String[] args) {
		CustomerRecords records = new CustomerRecords();

		records.addCustomer(new Customer("John"));
		records.addCustomer(new Customer("Simon"));

		for (Customer next : records) {
			System.out.println(next);
		}

		// Problem
		records.iterator().remove();
	}
}
