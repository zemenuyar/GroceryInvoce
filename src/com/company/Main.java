package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        ArrayList<GroceryItem> grocerylist = new ArrayList<>();
        String mygrocerylist = "";
        Scanner Sc = new Scanner(System.in);
        Random rn = new Random();


        do {


            System.out.println("Enter the item name");
            String userInputItemName = Sc.next();
            System.out.println("Enter the price");
            double userInputPrice = Sc.nextDouble();
            System.out.println("Enter the quntity");
            int userInputQuntity = Sc.nextInt();
            int userInputQuality = rn.nextInt(10);
            grocerylist.add(new GroceryItem(userInputItemName, userInputPrice, userInputQuntity,userInputPrice*userInputQuntity));
            System.out.println("Item Name" + "\t\t" + "price" + "\t\t" + "quntity" + "\t\t" + "cost");
            System.out.println("would you like to Enter more Item Y(yes) or N(no)");
            mygrocerylist = Sc.next();

            }while (!mygrocerylist.equalsIgnoreCase("no"));
        System.out.println("Item" + "\t\t\t" + "price" + "\t\t\t" + "Quntity" + "\t\t\t" + "cot");
        double purchaseAmount = 0;
        for (GroceryItem newlist: grocerylist){
            System.out.println(newlist.getName()+ "\t\t\t" + newlist.getPrice()+ "\t\t\t" + newlist.getQuantity()+ "\t\t\t" + "\t\t\t" + newlist.getCost());
            purchaseAmount +=newlist.getCost();

        }
        System.out.println("Total purchase Amount =" + purchaseAmount);
        System.out.println("Total Items purchased:" + grocerylist.size());
        if (purchaseAmount>20){
            System.out.println("you spent too much today");
        }
        else {
            System.out.println("Thank you for shopping!");

        }
        }

    }
