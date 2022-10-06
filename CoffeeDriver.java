package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;




class Item
{
    //main method (set variables, constructor, set/get)
    String itemName;
    double itemPrice;

    //constructor
    Item(String itemName, double itemPrice)
    {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    //set/get methods
    public String getitemName()
    {
        return itemName;
    }
    public void setitemName (String name)
    {
        itemName = name;
    }
    public double getitemPrice()
    {
        return itemPrice;
    }
    public void setitemPrice (double price)
    {
        itemPrice = price;
    }
}



public class CoffeeDriver
{
    //main method (create & initialize Item array, prompts for sort type, calls for sort type method)
    public static void main (String[] args)
    {
        String[] itemName = {"Coffee", "Water", "Milk", "Donut", "Bagel"};
        double[] itemPrice = {1.00, 2.00, 1.50, 1.25, 0.75};
        HashMap<String, Double> CoffeeItems = new HashMap<String, Double>();
        HashMap<Double, String> PriceItems = new HashMap<Double, String>();
        for(int i=0; i<itemName.length; i++)
        {
            CoffeeItems.put(itemName[i], itemPrice[i]);
            PriceItems.put(itemPrice[i], itemName[i]);
        }

        Scanner myScanner = new Scanner(System.in);

        String input;
        System.out.println ("Welcome to Wings Coffee Shop");
        System.out.println ("We have a great list of tasty items on our menu.");
        System.out.println ("Would you like to see these items sorted by");
        System.out.println ("name or by price? (n/p): ");
        input = myScanner.next();
//method to sort by item name and display

        if(input.equals("n"))
            Arrays.sort(itemName);

//method to sort by item price and display

        else if(input.equals("p"))
            Arrays.sort(itemPrice);

        for(int i=0; i<itemName.length; i++)
        {
            if(input.equals("n"))
                System.out.println(itemName[i] + " " + CoffeeItems.get(itemName[i]) );
            if(input.equals("p"))
                System.out.println(PriceItems.get(itemPrice[i]) + " " + itemPrice[i] );


        }


//exit program
        System.exit(0);
    }







}
