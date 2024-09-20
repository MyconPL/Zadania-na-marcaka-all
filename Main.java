import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Podaj liczbe: ");
        int liczba = scanner.nextInt();
        boolean warunekAND = (liczba % 2 == 0) && (liczba > 10);
        boolean warunekOR = (liczba % 2 != 0) || (liczba <= 5);
        System.out.println("Czy liczba jest parzysta i wieksza od 10? " + warunekAND);
        System.out.println("Czy liczba jest nieparzysta lub niewiększa od 5? " + warunekOR);
        System.out.println("Podaj litere: ");
        int litera = scanner.next().charAt(0);
        if (Character.isUpperCase(litera)) {
            System.out.println("Litera jest duza");
        } else if (Character.isLowerCase(litera)) {
            System.out.println("Litera jest mala");
        } else {
            System.out.println("To nie jest litera");
        }
    }
}