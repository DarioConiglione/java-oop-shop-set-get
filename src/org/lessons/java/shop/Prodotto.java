package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    private int codice;
    private String name;
    private String marca;
    private double prezzo;
    private int iva;

    public Prodotto(String name, String marca, double prezzo, int iva) {

        Random rand = new Random();
        this.codice = rand.nextInt(1000);
        this.name = name;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public int getCodice() {
        return this.codice;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        if (marca != null) {
            this.marca = marca;
        }
    }

    public double getPrezzo() {
        return this.prezzo;
    }

    public void setPrezzo(double prezzo) {
        if (prezzo > 0) {
            this.prezzo = prezzo;
        }
    }

    public int getIva() {
        return this.iva;
    }

}
