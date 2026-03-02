package org.lessons.java.shop;

public class Smartphone extends Prodotto {

    private String imei;
    private int ram;

    public Smartphone(String name, String marca, double prezzo, int iva, String imei, int ram) {

        super(name, marca, prezzo, iva);
        this.imei = imei;
        this.ram = ram;

    }

}
