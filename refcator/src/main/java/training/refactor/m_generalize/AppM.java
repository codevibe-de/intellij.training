package training.refactor.m_generalize;

import java.util.ArrayList;

public class AppM {

	public static void main(String[] args) {
		ArrayList<Product> products = new DefaultProductRepository().getProducts();
	}

}
