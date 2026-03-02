package org.lessons.java.shop;

public class Smartphone extends Prodotto {

    String imei;
    int ram;

    public Smartphone(String name, String marca, double prezzo, int iva, String imei, int ram) {

        super(name, marca, prezzo, iva);
        this.imei = imei;
        this.ram = ram;

    }

    @Override
    public String toString() {
        return super.toString() + " / Codice IMEI: " + imei + " / RAM: " + ram;
    }

    @Override
    public double calcolaPrezzoFinale() {
        if (ram < 32) {
            return prezzo + (prezzo * 0.22) - (prezzo * 0.05);
        }
        return super.calcolaPrezzoFinale();
    }

}
