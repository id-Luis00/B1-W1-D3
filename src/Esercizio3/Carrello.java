package Esercizio3;

import java.util.ArrayList;

public class Carrello {
    private Cliente ClienteAssociato;
    private ArrayList<Articolo> articoli;
    private double totPrezzoArticoli;

    public Carrello(Cliente cliente) {
        this.ClienteAssociato = cliente;
        this.totPrezzoArticoli = 0.0;
        this.articoli = new ArrayList<>();
    }

    public void aggiungiArticolo (Articolo articolo) {

        articoli.add(articolo);

    }

    @Override
    public String toString() {
        return "Carrello:" +
                "\n " + ClienteAssociato +
                "\n \n articoli=" + articoli +
                "\n  totPrezzoArticoli=" + totPrezzoArticoli;
    }
}
