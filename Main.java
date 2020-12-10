package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(java.lang.String[] args) {
        // write your code here COBISRevenue
        ArrayList<String> purchases = new ArrayList();
        purchases.add("Coke");
        purchases.add("Diet Coke");
        purchases.add("Pepsi");
        purchases.add("Sunflower Seeds");
        purchases.add("Peanuts");
        purchases.add("Red-Hot Spicy Doritos");
        purchases.add("Cool Ranch Doritos");
        purchases.add("Five Hour Energy");
        purchases.add("Dell Chargers");
        purchases.add("Mac Book Chargers");

        ArrayList<Double> prices = new ArrayList<Double>();
        prices.add(0.99);
        prices.add(0.99);
        prices.add(0.99);
        prices.add(0.99);
        prices.add(0.99);
        prices.add(2.99);
        prices.add(2.99);
        prices.add(3.99);
        prices.add(50.0);
        prices.add(120.0);

        ArrayList<String> cart = new ArrayList<>();
        ArrayList<Integer> cartPrices = new ArrayList<>();
        Archive archive = new Archive();

        float customerTotal;
        float grandTotal=0;

        Scanner customer = new Scanner(System.in);
        String userinput = "";
        String output = "";
        String products = "";
        System.out.println("Welcome to COBIS Convenience!");
        System.out.println("Enter User Name: ");

        while
        (!(userinput= customer.nextLine()).equalsIgnoreCase("Finish")){
            Customer order = new Customer();
            customerTotal = 0;
            products = "";
            output = "\n"+userinput;
            order.setName(output);
            System.out.println("Enter products user wants to purchase: \n Enter 'Done' to submit order ");
            while (!(userinput= customer.nextLine()).equalsIgnoreCase("Done")){
                for (String inventory: purchases){
                    if (!cart.contains(userinput)){
                        cart.add(userinput);
                        cartPrices.add(1);
                    } else {
                        int records = cart.indexOf(userinput);
                        cartPrices.set(records, cartPrices.get(records) +1);
                    }if ( inventory.equalsIgnoreCase(userinput)){
                        customerTotal += prices.get(purchases.indexOf(inventory));
                        products += "\n\t"+ userinput;
                        order.setCart(products);
                    }
                }
            }
            order.setOrdertotal(customerTotal);
            grandTotal += customerTotal;
            archive.display(order);
            System.out.println("\n Enter user name or 'Finish' to end");
        }
        System.out.println(archive.toString());
        System.out.println("Inventory Sold: ");
        for (String inventory: cart){// it once worked but I changed code around up top
            // then all of a sudden there's a zero behind the actual amount of items... debug couldn't even help me
            System.out.println("\tSold "+cartPrices.get(cart.indexOf(inventory))+ " of "+inventory);
        }
        System.out.println("\nGrand Total: $"+ grandTotal);

    }
}
