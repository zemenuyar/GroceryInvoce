package com.company;

public class GroceryItem {
    private String name;
    private double price;
    private int quantity;
    private double cost;


    public GroceryItem(String name, double price, int quantity, double cost) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public GroceryItem() {




    }
}
