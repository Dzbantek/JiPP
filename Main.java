import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kalkulator");

        System.out.print("Podaj pierwszą liczbę: ");
        double pierwszaLiczba = scanner.nextDouble();

        System.out.print("Podaj operację (+, -, *, /): ");
        char operacja = scanner.next().charAt(0);

        System.out.print("Podaj drugą liczbę: ");
        double drugaLiczba = scanner.nextDouble();

        double wynik;
        switch (operacja) {
            case '+':
                wynik = pierwszaLiczba + drugaLiczba;
                System.out.println("Wynik dodawania: " + wynik);
                break;
            case '-':
                wynik = pierwszaLiczba - drugaLiczba;
                System.out.println("Wynik odejmowania: " + wynik);
                break;
            case '*':
                wynik = pierwszaLiczba * drugaLiczba;
                System.out.println("Wynik mnożenia: " + wynik);
                break;
            case '/':
                if (drugaLiczba == 0) {
                    System.out.println("Nie dziel przez zero!");
                } else {
                    wynik = pierwszaLiczba / drugaLiczba;
                    System.out.println("Wynik dzielenia: " + wynik);
                }
                break;
            default:
                System.out.println("Błędny symbol działania");
                break;
        }

        System.out.println("Naciśnij Enter, aby zakończyć...");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}
