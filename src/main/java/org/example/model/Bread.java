package org.example.model;

public class Bread extends ProductForSale{
    private String weight;

    public Bread(String type, double price, String description) {
        super(type, price, description);
        this.weight = weight;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Weight: " + weight);
    }
}
