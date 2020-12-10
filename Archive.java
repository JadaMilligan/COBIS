package com.company;

import java.util.ArrayList;

public class Archive {
    private ArrayList<Customer> receipts = new ArrayList<>();

    public ArrayList<Customer> getReceipts() {
        return receipts;
    }

    public void setReceipts(ArrayList<Customer> receipts) {
        this.receipts = receipts;
    }
    public void display(Customer carts) {
        this.receipts.add(carts);
    }
    public String toString() {
        String output = "";
        output = "\nClosing Receipts: ";
        for (Customer carts : receipts) {
            output += "\n" + carts.toString();
            output += "\n";
        }
        return output;
    }
}
