package Esercizio3;

public class Main {
    public static void main(String[] args) {

        Cliente primoCliente = new Cliente("Luis", "Quiroz", "edinsonluis2014@gmail.com", "23/06/2024");
        Cliente secondoCliente = new Cliente("Edinson", "Mendoza", "edinsonluis2017@gmail.com", "03/03/2024");
        Cliente.datiCliente(primoCliente);

        System.out.println("--------------------");

        Cliente.datiCliente(secondoCliente);
        secondoCliente.toString();

        System.out.println("------------------------");

        Articolo articoloUno = new Articolo("lorem ipsum", 10.0, 100);
        System.out.println(articoloUno.toString());

        System.out.println("------");

        Articolo articoloDue = new Articolo("lorem ipsum lorem lorem", 2.35, 1000);
        System.out.println(articoloDue.toString());

        System.out.println("---------");

        Carrello carrello1 = new Carrello(primoCliente);
        carrello1.aggiungiArticolo(articoloDue);
        carrello1.aggiungiArticolo(articoloUno);
        System.out.println(carrello1.toString());


    }
}
