package main.java;

import java.beans.Transient;

public class ShipmentTest {
    public static Product door = new Product("Wooden door", 35);
    public static Product floorPanel = new Product("Floor panel", 25);
    public static Product window = new Product("Glass Windows", 10);

    private Shipment shipment = new Shipment();

    public void shouldAddItems() {
        shipment.add(door);
        shipment.add(window);
    }

    public void shouldReplaceItems() {
        shipment.add(door);
        shipment.add(window);
        shipment.replace(door, floorPanel);
        shipment.replace(floorPanel, window);
    }

    public void shouldIdentifyVanRequirements() {
        shipment.add(door);
        shipment.add(window);
        shipment.add(floorPanel);

        shipment.prepare();
        shipment.getlightVanProducts();
        shipment.getheavyVanProducts();
    }

    

}