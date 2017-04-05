package com.ArcSoftware;

/**
 * Created by Jake on 4/5/17.
 */
public class TV extends Video {
    public TV(String brand, String model, int quantity) {
        super(brand, model, quantity);
        this.category = "tv";

    }
}
