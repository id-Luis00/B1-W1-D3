package Esercizio3;

import java.util.Random;

public class Cliente {

    private int idCliente;
    private String name;
    private String surname;
    private String email;
    private String dataIscrizione;


    public Cliente ( String name, String surname, String email, String dataIscrizione) {
        Random random = new Random();
        this.idCliente = random.nextInt(1, 10000);
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getDataIscrizione() {
        return dataIscrizione;
    }

    public static void datiCliente(Cliente cliente) {
        System.out.println("dati cliente numero: "+ cliente.getIdCliente() );
        System.out.println("nome completo: " + cliente.getName() + " " + cliente.getSurname());
        System.out.println("email: " + cliente.getEmail());
        System.out.println("data iscrizione: " + cliente.getDataIscrizione());
    }

    @Override
    public String toString() {
        return "Cliente numero: " + idCliente +
                "\n nome='" + name + '\'' +
                "\n cognome='" + surname + '\'' +
                "\n email='" + email + '\'' +
                "\n data d'scrizione='" + dataIscrizione + '\'';
    }
}
