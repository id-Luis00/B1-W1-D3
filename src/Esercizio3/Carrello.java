package Esercizio3;

import java.util.ArrayList;

public class Carrello {
    private Cliente ClienteAssociato;
    private ArrayList<Articolo> articoli;
    private int totPrezzoArticoli;

    public Carrello(Cliente cliente, int totPrezzoArticoli) {
        this.ClienteAssociato = cliente;
        this.totPrezzoArticoli = totPrezzoArticoli;
        this.articoli = new ArrayList<>();
    }

}
