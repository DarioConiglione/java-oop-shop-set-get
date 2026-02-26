package org.lessons.java.shop;

public class Main {

    public static void main(String[] args) {

        Prodotto farina = new Prodotto("Farina", "Caputo", 2.99, 22);
        Prodotto burger = new Prodotto("Burger", "Kioene", 2.50, 22);

        System.out.println(farina.getMarca());
        System.out.println(burger.getPrezzo());
    }
}
