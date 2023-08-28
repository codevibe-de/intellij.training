package training.refactor.m_generalize;

public class AppM {

	public static void main(String[] args) {
		Iterable<Customer> customers = new DefaultCustomerRepository().getCustomers();
		for (Customer customer : customers) {
			System.out.println(customer);
		}
	}

}
