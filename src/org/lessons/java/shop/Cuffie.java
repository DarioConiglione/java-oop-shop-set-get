package org.lessons.java.shop;

public class Cuffie extends Prodotto {
    String colore;
    boolean isWireless;

    public Cuffie(String name, String marca, double prezzo, int iva, String colore, boolean isWireless) {
        super(name, marca, prezzo, iva);
        this.colore = colore;
        this.isWireless = isWireless;
    }

    @Override
    public String toString() {
        return super.toString() + " / Colore: " + colore + " / Wireless: " + isWireless;
    }

    @Override
    public double calcolaPrezzoFinale() {
        if (isWireless = false) {
            return prezzo + (prezzo * 0.22) - (prezzo * 0.07);
        }
        return super.calcolaPrezzoFinale();
    }

}
