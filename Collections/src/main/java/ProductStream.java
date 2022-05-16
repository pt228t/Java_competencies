package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ProductStream {
    public static void main(String[] args) throws Exception {
        Product door = new Product("Wooden door", 35);
        Product floorPanel = new Product("Floor panel", 25);
        Product window = new Product("Glass Windows", 10);

        List<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);
        products.add(floorPanel);
        products.add(window);
        nameofLightProductWeightSortedStream(products);
        
       
    }
    public static void nameofLightProductWeightSortedStream(final List<Product> products){
        products.stream().filter(product -> product.getWeight() < 30).sorted(Product.BY_WEIGHT).map(Product::getName).forEach(System.out::println);
        // Example of collector to assing the stream to collection 
        //List<String> lightweightProduct =
         products.stream().filter(product -> product.getWeight() < 30).sorted(Product.BY_WEIGHT).map(Product::getName);
        //collect(Collectors.toList());
        //System.out.println(lightweightProduct);
    }
}
