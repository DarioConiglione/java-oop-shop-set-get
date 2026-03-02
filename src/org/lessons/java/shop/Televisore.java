package org.lessons.java.shop;

public class Televisore extends Prodotto {
    private int pollici;
    private boolean isSmart;

    public Televisore(String name, String marca, double prezzo, int iva, int pollici, boolean isSmart) {
        super(name, marca, prezzo, iva);
        this.pollici = pollici;
        this.isSmart = true;
    }

    public String toString() {
        return super.toString() + " / Pollici: " + pollici + " / Smart-TV: " + isSmart;
    }
}
