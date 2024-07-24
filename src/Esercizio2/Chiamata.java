package Esercizio2;

public class Chiamata {

    private int durata;
    private String numTelefono;


    public Chiamata(int durata, String numeroTelefono) {
        this.durata = durata;
        this.numTelefono = numeroTelefono;
    }

    public int getDurata() {
        return durata;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    @Override
    public String toString() {
        return "Chiamata{" +
                "durata=" + durata +
                ", numTelefono='" + numTelefono + '\'' +
                '}';
    }
}
