package com.ArcSoftware;

/**
 * Created by Jake on 4/5/17.
 */
public class Cable extends Inventory {
    public Cable(String brand, String model, int quantity) {
        this.brand = brand;
        this.model = model;
        this.category = "Cable";
        this.quantity = quantity;

    }
}
