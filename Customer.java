package com.company;

public class Customer {
    private String name;
    private String cart;
    private float ordertotal;

    public Customer(String name, String cart, float ordertotal) {
        this.name = name;
        this.cart = cart;
        this.ordertotal = ordertotal;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setCart(String cart) {
        this.cart = cart;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getOrdertotal() {
        return ordertotal;
    }

    public void setOrdertotal(float ordertotal) {
        this.ordertotal = ordertotal;
    }

    public String toString() {
        String output = "";
        output += this.name;
        output += "\t" + this.cart;
        output += "\n \t\t" + this.ordertotal;
        return output;
    }
}
