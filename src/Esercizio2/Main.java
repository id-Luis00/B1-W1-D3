package Esercizio2;

public class Main {
    public static void main(String[] args) {

        Sim mioNumero = new Sim("3338566537", 5.30);

        mioNumero.AggiungiChiamate(new Chiamata(5,"3335463728"));
        mioNumero.AggiungiChiamate(new Chiamata(2,"3335733728"));
        mioNumero.AggiungiChiamate(new Chiamata(1,"3335243728"));
        mioNumero.AggiungiChiamate(new Chiamata(10,"3336163728"));
        mioNumero.AggiungiChiamate(new Chiamata(5,"3225463728"));

        Sim.stampaDatiSim(mioNumero);
    }
}
