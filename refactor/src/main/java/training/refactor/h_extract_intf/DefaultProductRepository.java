package training.refactor.h_extract_intf;

import java.util.ArrayList;

// TODO extract interface `ProductRepository` with methods `add` and `getProducts`
public class DefaultProductRepository {

	private ArrayList<Product> products = new ArrayList<>();

	public void add(Product p) {
		this.products.add(p);
	}

	public ArrayList<Product> getProducts() {
		return this.products;
	}
}
