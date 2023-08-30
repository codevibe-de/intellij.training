package training.refactor.m_generalize;

import java.util.ArrayList;
import java.util.List;

// TODO 2) create a copy of this class and make it a Product repository
public class DefaultCustomerRepository {

    private ArrayList<Customer> customers = new ArrayList<>();

    public void add(Customer c) {
        this.customers.add(c);
    }

    // TODO 1) generalize the return type to `Iterable`
    public List<Customer> getCustomers() {
        return this.customers;
    }
}
