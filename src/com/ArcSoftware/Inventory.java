package com.ArcSoftware;

/**
 * Created by Jake on 4/5/17.
 */
public class Inventory {
    String brand;
    String model;
    String category;
    int quantity;

    public static void addInventory() {

        System.out.printf("Please enter the brand of the item: \n");
        String brand = Main.inputScanner.nextLine();
        System.out.printf("Please enter the model of the item: \n");
        String model = Main.inputScanner.nextLine();
        System.out.printf("Please enter the quantity of the item: \n");
        String quantity = Main.inputScanner.nextLine();
        System.out.println("Please enter the category of the item: \n The categories are as follows: \n  " + ClassList());
        String enteredCategory = Main.inputScanner.nextLine();
        //String enteredCategoryIC = enteredCategory.equalsIgnoreCase();
        switch (enteredCategory) {
            case "amp":
                Main.inventory.add(new Amp(brand, model, Integer.valueOf(quantity)));
                break;
            case "audio":
                Main.inventory.add(new Audio(brand, model, Integer.valueOf(quantity)));
            case "cable":
                Main.inventory.add(new Cable(brand, model, Integer.valueOf(quantity)));
                break;
            case "computer":
                Main.inventory.add(new Computer(brand, model, Integer.valueOf(quantity)));
                break;
            case "furniture":
                Main.inventory.add(new Furniture(brand, model, Integer.valueOf(quantity)));
                break;
            case "mac":
                Main.inventory.add(new Mac(brand, model, Integer.valueOf(quantity)));
                break;
            case "pc":
                Main.inventory.add(new PC(brand, model, Integer.valueOf(quantity)));
                break;
            case "projector":
                Main.inventory.add(new Projector(brand, model, Integer.valueOf(quantity)));
                break;
            case "speaker":
                Main.inventory.add(new Speaker(brand, model, Integer.valueOf(quantity)));
                break;
            case "tv":
                Main.inventory.add( new TV(brand, model, Integer.valueOf(quantity)));
                break;
            case "video":
                Main.inventory.add(new Video(brand, model, Integer.valueOf(quantity)));
                break;
        }
        System.out.printf("You have added (%s) %s %s to your inventory. \n Returning to Main Menu.", quantity, model, brand);
    }

    public static String ClassList() {
            System.out.println("[Amp] [Audio] [Cable] [Computer] [Furniture] \n  [Mac] [PC] [Projector] [Speaker] [TV] [Video]");
            return null;
        }
    public static void removeInventory() {

        System.out.printf("Please enter the brand of the item: \n");
        String brand = Main.inputScanner.nextLine();
        System.out.printf("Please enter the model of the item: \n");
        String model = Main.inputScanner.nextLine();
        System.out.printf("Please enter the quantity of the item: \n");
        String quantity = Main.inputScanner.nextLine();
        System.out.println("Please enter the category of the item: \n The categories are as follows: \n  " + ClassList());
        String enteredCategory = Main.inputScanner.nextLine();
        //String enteredCategoryIC = enteredCategory.equalsIgnoreCase();
        switch (enteredCategory) {
            case "amp":
                Main.inventory.remove(new Amp(brand, model, Integer.valueOf(quantity)));
                break;
            case "audio":
                Main.inventory.remove(new Audio(brand, model, Integer.valueOf(quantity)));
            case "cable":
                Main.inventory.remove(new Cable(brand, model, Integer.valueOf(quantity)));
                break;
            case "computer":
                Main.inventory.remove(new Computer(brand, model, Integer.valueOf(quantity)));
                break;
            case "furniture":
                Main.inventory.remove(new Furniture(brand, model, Integer.valueOf(quantity)));
                break;
            case "mac":
                Main.inventory.remove(new Mac(brand, model, Integer.valueOf(quantity)));
                break;
            case "pc":
                Main.inventory.remove(new PC(brand, model, Integer.valueOf(quantity)));
                break;
            case "projector":
                Main.inventory.remove(new Projector(brand, model, Integer.valueOf(quantity)));
                break;
            case "speaker":
                Main.inventory.remove(new Speaker(brand, model, Integer.valueOf(quantity)));
                break;
            case "tv":
                Main.inventory.remove(new TV(brand, model, Integer.valueOf(quantity)));
                break;
            case "video":
                Main.inventory.remove(new Video(brand, model, Integer.valueOf(quantity)));
                break;
        }
        System.out.printf("You have removed (%s) %s %s to your inventory. \n Returning to Main Menu.", quantity, model, brand);
    }

    }

