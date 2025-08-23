package Day9;

import java.util.*;

class Product6 {
    private String name;
    private double price;
    
    public Product6(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() { return name; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return name + " - " + price;
    }
}

public class Products {
    public static void main(String[] args) {
        List<Product6> products = Arrays.asList(
            new Product6("Laptop", 80000),
            new Product6("Phone", 30000),
            new Product6("Tablet", 20000)
        );


        products.sort(Comparator.comparing(Product6::getName));
        System.out.println("Sorted by Name: " + products);

        products.sort(Comparator.comparingDouble(Product6::getPrice));
        System.out.println("Sorted by Price: " + products);
    }
}
