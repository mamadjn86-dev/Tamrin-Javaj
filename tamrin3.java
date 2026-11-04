import java.util.Scanner;

public class tamrin3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hazine Kole Eshterak:");
        String Hazineinput = scanner.nextLine();
        System.out.print("Tedad Nafarat Eshterak:");
        String Tedadinput = scanner.nextLine();

        double HazineKol;
        double TedadKol;

        try {
            HazineKol = Double.parseDouble(Hazineinput);
            TedadKol = Double.parseDouble(Tedadinput);
        } catch (NumberFormatException e) {
            System.out.println("Vorodi Dorost Nist.");
            scanner.close();
            return;
        }

        if (TedadKol == 0) {
            System.out.println("Tedad Nemitavanad 0 Bashad.");
            return;
        } 
        if (TedadKol < 0 || HazineKol < 0) {
            System.out.println("Meghadar Vared Shode Nmietavanad Khali Ya Manfi Bashad.");
        } else {
            double temp = HazineKol / TedadKol;
            System.out.println("Tedad hazine Har Nafar:" + temp);
        }

    }
}