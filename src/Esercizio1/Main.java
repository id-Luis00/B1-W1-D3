package Esercizio1;

import java.util.concurrent.RecursiveTask;

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo(5, 3);
        Rettangolo rettangolo2 = new Rettangolo(7, 2.5);
        Rettangolo rettangolo3 = new Rettangolo(2.40, 5);

        System.out.println("-------------------stampaRettangolo--------------------------");
        Rettangolo.stampaRettangolo(rettangolo1);

        Rettangolo.stampaDueRettangoli(rettangolo2, rettangolo3);
    }
}

