package training.refactor.m_generalize;

import java.util.ArrayList;

public class DefaultCustomerRepository {

	private ArrayList<Customer> customers = new ArrayList<>();

	public void add(Customer c) {
		this.customers.add(c);
	}

	// TODO generalize the return type to `Iterable`
	public Iterable<Customer> getCustomers() {
		return this.customers;
	}
}
