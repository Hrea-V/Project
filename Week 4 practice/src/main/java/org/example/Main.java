package org.example;

import com.google.gson.Gson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        KombuchaInventory ki = new KombuchaInventory();
        Scanner input = new Scanner(System.in);


        boolean loop;
        do {
            System.out.println("What do you want to do?");
            System.out.println("1. Add");
            System.out.println("2. Remove");
            System.out.println("3. Search");
            System.out.println("4. List");
            String answer = input.nextLine();
            loop = true;
            switch (answer) {
                case "1" -> {
                    Kombucha k = new Kombucha();
                    System.out.println("Name of the flavor.");
                    String flavor = input.nextLine();
                    k.setName(flavor);
                    System.out.println("Quantity of the flavor.");
                    int quantity = Integer.parseInt(input.nextLine());
                    k.setQuantity(quantity);
                    System.out.println("price of the flavor.");
                    double price = Double.parseDouble(input.nextLine());
                    k.setPrice(price);
                    ki.addKombucha(k);
                }
                case "2" -> {
                    System.out.println("Name of the flavor.");
                    String flavor = input.nextLine();
                    ki.removeKombucha(flavor);
                }
                case "3" -> {
                    System.out.println("Name of the flavor.");
                    String flavor = input.nextLine();
                    ki.findKombucha(flavor);
                }
                case "4" -> {
                    System.out.println("Kombucha list");
                    ki.printInventory();
                }
                default -> {
                    System.out.println("Wrong input");
                    System.out.println("please try again");
                    input.nextLine();
                }
            }

            System.out.println("Do you want to continue? (y/n)");
            answer = input.nextLine();

            switch (answer) {
                case "y" -> {
                    loop = true;
                }
                case "n" -> {
                    loop = false;
                }
            }
        } while (loop);
        Gson gson = new Gson();
        System.out.println(gson.toJson(ki));
    }
}

