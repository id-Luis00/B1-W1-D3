package Esercizio1;

public class Rettangolo {
    private double altezza;
    private double larghezza;

    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public double calcolaPerimetro() {
        return 2 * (altezza + larghezza);
    }

    public double calcolaArea() {
        return altezza * larghezza;
    }

    public double getAltezza() {
        return altezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public static void stampaRettangolo(Rettangolo rettangolo) {
        double area = rettangolo.calcolaArea();
        double perimetro = rettangolo.calcolaPerimetro();
        System.out.println("Rettangolo: altezza = " + rettangolo.getAltezza() + ", larghezza = " + rettangolo.getLarghezza());
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
    }

    public static void stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2) {
        System.out.println("----------------stampaDueRettangoli-----------------------");
        stampaRettangolo(rettangolo1);
        stampaRettangolo(rettangolo2);
        double sommaAree = rettangolo1.calcolaArea() + rettangolo2.calcolaArea();
        double sommaPerimetri = rettangolo1.calcolaPerimetro() + rettangolo2.calcolaPerimetro();
        System.out.println("Somma delle aree: " + sommaAree);
        System.out.println("Somma dei perimetri: " + sommaPerimetri);
    }
}
