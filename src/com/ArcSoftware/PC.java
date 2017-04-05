package com.ArcSoftware;

/**
 * Created by Jake on 4/5/17.
 */
public class PC extends Computer {
    public PC(String brand, String model, int quantity) {
        super(brand, model, quantity);
        this.category = "pc";

    }
}
