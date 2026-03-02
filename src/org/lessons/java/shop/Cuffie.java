package org.lessons.java.shop;

public class Cuffie extends Prodotto {
    private String colore;
    private boolean isWireless;

    public Cuffie(String name, String marca, double prezzo, int iva, String colore, boolean isWireless) {
        super(name, marca, prezzo, iva);
        this.colore = colore;
        this.isWireless = true;
    }

}
