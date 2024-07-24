import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quale esercizio vuoi fare? (1, 2, 3)");
        int risposta = Integer.parseInt(scanner.nextLine());

        switch (risposta) {
            case 1:
                System.out.printf("esericizio 1");
                break;
            case 2:
                System.out.printf("esericizio 2");
                break;
            case 3:
                System.out.printf("esericizio 3");
                break;
            default:
                break;
        }


    }
}