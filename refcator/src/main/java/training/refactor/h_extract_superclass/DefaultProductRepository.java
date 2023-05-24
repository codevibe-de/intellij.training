package training.refactor.h_extract_superclass;

import java.util.ArrayList;

// TASKS:
// - extract a superclass `AbstractRepository` which contains a list of generic items
// - rename fields and methods as appropriate
public class DefaultProductRepository {

	private ArrayList<Product> products = new ArrayList<>();

	public void add(Product p) {
		this.products.add(p);
	}

	public ArrayList<Product> getProducts() {
		return this.products;
	}
}
