package main.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable<Product> {
    private static final int Light_Van_Max_Weight = 20;
    private static final int Missing_Product = -1; 
    private final List<Product>  products = new ArrayList<>();
    private List<Product> lightVanProducts = new ArrayList<>();
    private List<Product> heavyVanProducts = new ArrayList<>();
    
    public void add(Product product) {
        products.add(product);

    }

    @Override
    public Iterator<Product> iterator() {
        // TODO Auto-generated method stub
        return products.iterator();
    }

    public boolean replace(Product oldProduct, Product newProduct) {
        int position = products.indexOf(oldProduct);
        //When proudct is not found then List will return the index number as -1 
        if(position == Missing_Product){
            return false;
        }
        else {
            products.set(position, newProduct);
            return true;
        }  
    }

    public void prepare() {
        // sort the product list
        products.sort(Product.BY_WEIGHT);
        //find the split point 
        int splitPoint = findSplitPoint();
        //create two subviews of the list
        lightVanProducts =  products.subList(0, splitPoint);
        heavyVanProducts =  products.subList(splitPoint, products.size());
    }

    private int findSplitPoint() {
        int size = products.size();
        for (int i=0; i<size; i++) {
           Product product = products.get(i);
           if(product.getWeight() > Light_Van_Max_Weight ) {
                return i;
           }
        }
        return 0;
    }

    public List<Product> getlightVanProducts() {
        return lightVanProducts;
    }

    public List<Product> getheavyVanProducts() {
        return heavyVanProducts;
    }
    

}
