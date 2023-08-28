package training.refactor.i_pullup_pushdown;

import java.util.ArrayList;

public class AbstractRepository<T> {

	private ArrayList<T> items = new ArrayList<>();

	public void add(T item) {
		this.items.add(item);
	}

	public ArrayList<T> getAll() {
		return this.items;
	}

	// TODO push this method down into DefaultProductRepository (and simplify it then)
	public void printProductIds() {
		getAll().forEach(it -> {
			if (it instanceof Product p) {
				System.out.println(p.getId());
			}
		});
	}
}
