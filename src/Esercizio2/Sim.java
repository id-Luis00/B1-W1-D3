package Esercizio2;

import java.util.ArrayList;
import java.util.Arrays;

public class Sim {
    private String telefono;
    private double credito;
    private ArrayList<Chiamata> chiamate;


    public Sim(String telefono, double credito) {
        this.telefono = telefono;
        this.credito = credito;
        this.chiamate= new ArrayList<>();

    }

    public String getTelefono() {
        return telefono;
    }

    public double getCredito() {
        return credito;
    }

    public ArrayList<Chiamata> getChiamate() {
        return chiamate;
    }

    public void AggiungiChiamate(Chiamata chiamata) {
        if (chiamate.size() == 5) {
            chiamate.removeFirst();
            chiamate.add(chiamata);
        } else {
            chiamate.add(chiamata);
        }
    }


    public static void stampaDatiSim(Sim sim) {
        System.out.println("Numero di telefono: " + sim.getTelefono());
        System.out.println("Credito disponibile: €" + sim.getCredito() );
        System.out.println("Chiamate:");
        for (Chiamata chiamata : sim.getChiamate()) {
            System.out.printf("Durata: %d minuti, Numero chiamato: %s%n",
                    chiamata.getDurata(), chiamata.getNumTelefono());
        }
    }



}
