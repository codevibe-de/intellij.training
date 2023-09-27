package training.refactor.d3_extract_superclass;

import training.refactor.Product;

import java.util.ArrayList;

// TODO extract a superclass `AbstractRepository`, which can manage a list of generic items
// Hint: "Change Signature" might be useful for the new abstract class...

// TODO rename fields and methods as appropriate
// Hint: rename the field first
public class DefaultProductRepository {

    private ArrayList<Product> products = new ArrayList<>();

    public void add(Product p) {
        this.products.add(p);
    }

    public ArrayList<Product> getProducts() {
        return this.products;
    }

}
