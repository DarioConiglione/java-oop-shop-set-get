package org.lessons.java.shop;

public class Televisore extends Prodotto {
    int pollici;
    boolean isSmart;

    public Televisore(String name, String marca, double prezzo, int iva, int pollici, boolean isSmart) {
        super(name, marca, prezzo, iva);
        this.pollici = pollici;
        this.isSmart = isSmart;
    }

    @Override
    public String toString() {
        return super.toString() + " / Pollici: " + pollici + " / Smart-TV: " + isSmart;
    }

    @Override
    public double calcolaPrezzoFinale() {
        if (isSmart = false) {
            return prezzo + (prezzo * 0.22) - (prezzo * 0.1);
        }
        return super.calcolaPrezzoFinale();
    }
}
