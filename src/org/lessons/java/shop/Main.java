package org.lessons.java.shop;

public class Main {

    public static void main(String[] args) {

        Prodotto farina = new Prodotto("Farina", "Caputo", 2.99, 22);
        Prodotto burger = new Prodotto("Burger", "Kioene", 2.50, 22);

        System.out.println(farina.getMarca());
        System.out.println(burger.getPrezzo());

        Smartphone cellulare1 = new Smartphone("Galaxy S26", "Samsung", 999, 22, "ASD1234FDS", 16);
        System.out.println(
                "Questo cellulare è " + cellulare1.name + " e costa esattamente " + cellulare1.prezzo + "euro");
        cellulare1.setName("IPhone-18");
        cellulare1.setMarca("Apple");
        cellulare1.setPrezzo(1300);
        System.out.println(
                "Questo cellulare è " + cellulare1.name + " e costa esattamente " + cellulare1.prezzo + "euro");
    }
}
