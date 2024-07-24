package Esercizio3;

import java.util.Random;

public class Articolo {
    private int idArticolo;
    private String descArticolo;
    private double prezzoArticolo;
    private int numPezzi;


    Articolo(String descArticolo, double prezzoArticolo, int numPezzi) {
        Random random = new Random();
        this.idArticolo = random.nextInt(1, 10000);
        this.descArticolo = descArticolo;
        this.prezzoArticolo = prezzoArticolo;
        this.numPezzi = numPezzi;
    }

    public int getIdArticolo() {
        return idArticolo;
    }

    public String getDescArticolo() {
        return descArticolo;
    }

    public double getPrezzoArticolo() {
        return prezzoArticolo;
    }

    public int getNumPezzi() {
        return numPezzi;
    }

    @Override
    public String toString() {
        return "Articolo numero:" + idArticolo +
                "\n descrizione articolo= '" + descArticolo + '\'' +
                "\n prezzo articolo= €" + prezzoArticolo +
                "\n numero pezzi dell'articolo= " + numPezzi;
    }
}
