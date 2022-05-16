package main.java;

import java.util.Comparator;

public class Product {
   private String name;
   private int weight;
    public Product(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    
    public int getWeight() {
        return weight;
    }
    public String getName() {
        return name;
    }

    public static final Comparator<Product> BY_WEIGHT = Comparator.comparingInt(Product::getWeight);
}
