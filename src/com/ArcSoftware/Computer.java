package com.ArcSoftware;

/**
 * Created by Jake on 4/5/17.
 */
public class Computer extends Inventory {
    public Computer(String brand, String model, int quantity) {
        this.brand = brand;
        this.model = model;
        this.category = "Computer";
        this.quantity = quantity;

    }
}
