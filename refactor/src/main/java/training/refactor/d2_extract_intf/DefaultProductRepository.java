package training.refactor.d2_extract_intf;

import training.refactor.Product;

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

	public static void someStatic() {}

	private void somePrivate() {}

}
