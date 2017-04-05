package com.ArcSoftware;

/**
 * Created by Jake on 4/5/17.
 */
public class Video extends Inventory {
    public Video(String brand, String model, int quantity) {
        this.brand = brand;
        this.model = model;
        this.category = "Video";
        this.quantity = quantity;

    }
}
