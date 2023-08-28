package training.refactor.m_generalize;

import java.util.List;

public class AppM {

	public static void main(String[] args) {
		List<Customer> customers = new DefaultCustomerRepository().getCustomers();
		for (Customer customer : customers) {
			System.out.println(customer);
		}
	}

}
