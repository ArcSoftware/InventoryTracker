package com.ArcSoftware;

/**
 * Created by Jake on 4/5/17.
 */
public class Speaker extends Audio {
    public Speaker(String brand, String model, int quantity) {
        super(brand, model, quantity);
        this.category = "speaker";

    }
}
