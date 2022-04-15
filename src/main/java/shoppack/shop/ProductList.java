package shoppack.shop;

import java.util.ArrayList;

public class ProductList {
    ArrayList<Product> productList = new ArrayList<>();

    public ProductList() {
        productList.add(new Product("Apple", 100, 100));
        productList.add(new Product("Orange", 200, 200));
    }

    public Product getProduct(String name) {
        Product a = new Product("", 0, 0);
        for (Product p : productList) {
            if (name == p.getProductName()) {
                return p;
            }
        }
        return a;
    }

    public void updateStock(Product p, int quantity) {
        p.updateStock(quantity);
        for (Product pp : productList) {
            if (p.getProductName() == pp.getProductName()) {
                pp = p;
            }
        }
    }
}