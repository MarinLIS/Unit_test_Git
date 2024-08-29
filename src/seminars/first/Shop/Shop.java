package src.seminars.first.Shop;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Shop {

       private final List<Product> products;

        public Shop() {
            this.products = new ArrayList<>();
        }

        public void addProduct(String name, int price) {
            products.add(new Product(name, price));
        }

        // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
        public void sortProductsByPrice() {
            Collections.sort(products, Comparator.comparingInt(Product::getCost));
        }

    // Метод должен вернуть самый дорогой продукт
        public Product getMostExpensiveProduct() {
            return products.stream()
                    .max(Comparator.comparingInt(Product::getCost))
                    .orElse(null);
        }

        public int getSize() {
            return products.size();
        }

        public List<Product> getProducts() {
            return products; }
    }

