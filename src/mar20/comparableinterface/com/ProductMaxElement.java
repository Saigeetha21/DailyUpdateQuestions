package mar20.comparableinterface.com;

import java.util.ArrayList;
import java.util.Collections;

class Product implements Comparable<Product> {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class ProductMaxElement {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1200.50));
        products.add(new Product("Mobile", 800.25));
        products.add(new Product("Tablet", 500.75));

        Product maxProduct = Collections.max(products);
        System.out.println("Maximum priced product: " + maxProduct);
    }
}

 
