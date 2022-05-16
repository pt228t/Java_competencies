package main.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionConcepts {
    public static void main(String[] args) throws Exception {
        Product door = new Product("Wooden door", 35);
        Product floorPanel = new Product("Floor panel", 25);
        Product window = new Product("Glass Windows", 10);
    
        // One of the way to implement an array 
        //Product[] products = {floorPanel, window, door};
        // It will print the reference of the products instead of the values
        //System.out.println(Arrays.toString(products));

        //Collection implementation
        Collection<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);

        Iterator<Product> iterator = products.iterator();
        while(iterator.hasNext()) {
            Product product = iterator.next();
            if(product.getWeight() > 20) {
                iterator.remove();
            }
        }
        for(Product product: products){
            System.out.println(product.getName());
        }
        
    }
}
