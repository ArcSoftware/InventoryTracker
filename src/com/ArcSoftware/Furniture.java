package com.ArcSoftware;

/**
 * Created by Jake on 4/5/17.
 */
public class Furniture extends Inventory {
    public Furniture(String brand, String model, int quantity) {
        this.brand = brand;
        this.model = model;
        this.category = "Furniture";
        this.quantity = quantity;

    }
}
