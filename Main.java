import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        double num1 = scanner.nextDouble();

        System.out.print("Podaj drugą liczbę: ");
        double num2 = scanner.nextDouble();

        System.out.print("Podaj trzecią liczbę: ");
        double num3 = scanner.nextDouble();

        double suma = num1 + num2 + num3;
        System.out.println("Suma: " + suma);

        double roznica = num1 - num2 - num3;
        System.out.println("Różnica: " + roznica);

        double iloczyn = num1 * num2 * num3;
        System.out.println("Iloczyn: " + iloczyn);

        if (num2 != 0 && num3 != 0) {
            double iloraz = num1 / num2 / num3;
            System.out.println("Iloraz: " + iloraz);
        } else {
            System.out.println("Nie można dzielić przez zero!");
        }

        scanner.close();
    }
}
