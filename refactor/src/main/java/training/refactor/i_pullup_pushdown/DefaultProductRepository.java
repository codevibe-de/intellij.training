package training.refactor.i_pullup_pushdown;

import training.refactor.Product;

public class DefaultProductRepository extends AbstractRepository<Product> {

	// TODO pull this method up into superclass
	public void printAll() {
		getAll().forEach(System.out::println);
	}

}
