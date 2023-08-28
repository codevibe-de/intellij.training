package training.refactor.i_pullup_pushdown;

public class DefaultProductRepository extends AbstractRepository<Product> {

	// TODO pull this method up into superclass
	public void printAll() {
		getAll().forEach(System.out::println);
	}

}
