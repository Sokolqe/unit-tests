package seminars.first.hw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Shop {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    /**
     * @return отсортированный по возрастанию и цене список продуктов
     */
    public List<Product> getSortedListProducts(List<Product> productList) {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < productList.size(); i++) {
                if (productList.get(i).getCost() < productList.get(i - 1).getCost()) {
                    Collections.swap(productList, i, i-1);
                    needIteration = true;
                }
            }
        }
        return productList;
    }

    /**
     * @return самый дорогой продукт
     */
    public Product getMostExpensiveProduct(List<Product> productList) {

        return null;
    }
}