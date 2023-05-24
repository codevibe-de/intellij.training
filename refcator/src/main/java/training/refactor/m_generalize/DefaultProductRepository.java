package training.refactor.m_generalize;

import java.util.ArrayList;

public class DefaultProductRepository {

	private ArrayList<Product> products = new ArrayList<>();

	public void add(Product p) {
		this.products.add(p);
	}

	// TODO generalize the return type to `Iterable`
	public ArrayList<Product> getProducts() {
		return this.products;
	}
}
