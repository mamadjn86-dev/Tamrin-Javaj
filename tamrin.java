import java.util.Scanner;

public class tamrin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double Gheymat = 5000;

        System.out.print("Meghdar Hajm Shoma (GB): ");
        String Hajminput = scanner.nextLine();

        System.out.print("Meghdar Pol Shoma (Toman): ");
        String Moneyinput = scanner.nextLine();

        double Hajm;
        double Money;

        try {
            Hajm = Double.parseDouble(Hajminput);
            Money = Double.parseDouble(Moneyinput);
        } catch (NumberFormatException e) {
            System.out.println("Vorodi Dorost Nist.");
            scanner.close();
            return;
        }

        if (Hajm <= 0 || Money < 0) {
            System.out.println("Vorodi Dorost Nist.");
            scanner.close();
            return;
        }

        double Gheymatkol = Hajm * Gheymat;

        if (Hajm > 10) {
            double Takhfif = Gheymatkol * 0.15;
            Gheymatkol = Gheymatkol - Takhfif;
            System.out.println("15% Takhfif : " + Takhfif + " Toman");
        }

        System.out.println("Gheymat Kol: " + Gheymatkol + " Toman");

        if (Money >= Gheymatkol) {
            double Baghimande = Money - Gheymatkol;
            System.out.println("Kharid Movafagh. Baghimande Pol Shoma: " + Baghimande + " Toman");
        } else {
            double Kambod = Gheymatkol - Money;
            System.out.println("Pol Shoma kafi Nist Be Meghdare " + Kambod + " Toman");
        }

        scanner.close();
    }
}