package org.example.model;

public class Coke extends ProductForSale{
    private String size;

    public Coke(String type, double price, String description) {
        super(type, price, description);
        this.size = size;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Size: " + size);
    }
}
