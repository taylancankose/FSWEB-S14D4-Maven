package org.example.model;

// Abstract class for products
public abstract class ProductForSale {
    private String type;
    private double price;
    private String description;

    // Constructor
    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    // Getters
    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    // Method to calculate sales price based on quantity
    public double getSalesPrice(int quantity) {
        return quantity * price;
    }

    // Abstract method to show details
    public abstract void showDetails();
}
