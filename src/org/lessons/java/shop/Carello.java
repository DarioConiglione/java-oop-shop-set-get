package org.lessons.java.shop;

import java.util.Scanner;

public class Carello {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quanti prodotti stai comprando?");
        int numberOfItems = scan.nextInt();
        System.out.println("Hai la tessera fedeltà?");
        boolean haTessera = scan.nextBoolean();
        scan.nextLine();

        Prodotto[] listaProdotti = new Prodotto[numberOfItems];

        for (int i = 0; i < listaProdotti.length; i++) {
            System.out.println("\n Inserimento prodotto " + (i + 1));
            System.out.println("Che prodotto vuoi inserire? Smartphone , Televisore, Cuffie");
            String selezione = scan.nextLine();

            System.out.println("Nome:");
            String nomeProdotto = scan.nextLine();

            System.out.println("Marca:");
            String marcaProdotto = scan.nextLine();

            System.out.println("Prezzo:");
            double prezzoProdotto = scan.nextDouble();

            System.out.println("IVA:");
            int ivaProdotto = scan.nextInt();
            scan.nextLine();

            switch (selezione.toLowerCase()) {
                case "smartphone":
                    System.out.println("Codice IMEI:");
                    String imeiProdotto = scan.nextLine();

                    System.out.println("Memoria:");
                    int ramProdotto = scan.nextInt();
                    scan.nextLine();

                    listaProdotti[i] = new Smartphone(nomeProdotto, marcaProdotto, prezzoProdotto, ivaProdotto,
                            imeiProdotto, ramProdotto);
                    break;

                case "televisore":
                    System.out.println("Pollici:");
                    int dimensioneProdotto = scan.nextInt();

                    System.out.println("Smart-tv:");
                    boolean smartProdotto = scan.nextBoolean();
                    scan.nextLine();

                    listaProdotti[i] = new Televisore(nomeProdotto, marcaProdotto, prezzoProdotto, ivaProdotto,
                            dimensioneProdotto, smartProdotto);
                    break;

                case "cuffie":
                    System.out.println("Colore:");
                    String coloreProdotto = scan.nextLine();

                    System.out.println("Wireless:");
                    boolean wirelessProdotto = scan.nextBoolean();
                    scan.nextLine();

                    listaProdotti[i] = new Cuffie(nomeProdotto, marcaProdotto, prezzoProdotto, ivaProdotto,
                            coloreProdotto, wirelessProdotto);
                    break;

                default:
                    i--;
                    break;
            }

        }

        double totaleDaPagare = 0;

        System.out.println("\n -PRODOTTI NEL CARELLO-");
        for (Prodotto p : listaProdotti) {
            if (p != null) {
                System.out.println(p.toString());
                if (haTessera) {
                    totaleDaPagare += p.calcolaPrezzoFinale();
                } else {
                    totaleDaPagare += p.getPrezzo();
                }
            }
        }
        System.out.println("Totale carrello: " + totaleDaPagare);
        scan.close();

    }

}
