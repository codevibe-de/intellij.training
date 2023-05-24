package training.refactor.m_generalize;

public class AppM {

	public static void main(String[] args) {
		Iterable<Product> products = new DefaultProductRepository().getProducts();
	}

}
