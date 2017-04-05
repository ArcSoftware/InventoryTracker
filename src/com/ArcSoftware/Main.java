package com.ArcSoftware;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner inputScanner = new Scanner(System.in);
    public static ArrayList<Inventory> inventory = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Welcome to Jake's POS system. \n You are in the inventory management terminal");
        while (true) {
            System.out.println("What would you like to do? \n 1. Add inventory \n 2. Remove inventory \n 3. List Inventory");
            String rootEntry = inputScanner.nextLine();

            if (rootEntry.contains("1") || rootEntry.equalsIgnoreCase("add") || rootEntry.equalsIgnoreCase("add inventory")) {
                Inventory.addInventory();

            } else if (rootEntry.contains("2") || rootEntry.equalsIgnoreCase("remove") || rootEntry.equalsIgnoreCase("remove inventory")) {
                Inventory.removeInventory();

            } else if (rootEntry.contains("3") || rootEntry.equalsIgnoreCase("list") || rootEntry.equalsIgnoreCase("list inventory")) {
                for (int i = 0; i < inventory.size(); i++) {
                    System.out.printf("%d.  (%s)  %s %s \n \n Returning to Main Menu.", (i+1), inventory.get(i).quantity, inventory.get(i).brand, inventory.get(i).model);

                }
            }
        }
    }
}
