package training.refactor.m_generalize;

import java.util.List;

public class AppM {

	public static void main(String[] args) {
		List<Product> products = new DefaultProductRepository().getProducts();
	}

}
