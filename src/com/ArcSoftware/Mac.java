package com.ArcSoftware;

/**
 * Created by Jake on 4/5/17.
 */
public class Mac extends Computer {
    public Mac(String brand, String model, int quantity) {
        super(brand, model, quantity);

        this.category = "Mac";
    }
}
