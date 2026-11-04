import java.util.Scanner;

public class tamrin2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean notificationsEnabled = true;
        boolean running = true;

        while (running) {
            System.out.println();
            System.out.println("=== Notification Settings ===");
            System.out.println("1. Roshan Kardan notifications");
            System.out.println("2. Khamosh Kardan notifications");
            System.out.println("3. Vazeiat notification ");
            System.out.println("4. Bargardandan Halat Aval settings");
            System.out.println("5. Khoroj");
            System.out.print("Enter your choice (1-5): ");

            String choiceInput = scanner.nextLine();

            int choice;
            choice = Integer.parseInt(choiceInput);

            switch (choice) {
                case 1:
                    notificationsEnabled = true;
                    System.out.println("Notifications Roshan Shod.");
                    break;
                case 2:
                    notificationsEnabled = false;
                    System.out.println("Notifications Khamosh Shod.");
                    break;
                case 3:
                    if (notificationsEnabled) {
                        System.out.println("Notifications Hast Roshan.");
                    } else {
                        System.out.println("Notifications Hast Khamosh.");
                    }
                    break;
                case 4:
                    notificationsEnabled = true;
                    System.out.println("Be Halat Avaliye bazgasht. Notifications Roshan Shod.");
                    break;
                case 5:
                    running = false;
                    System.out.println("By!");
                    break;
                default:
                    System.out.println("Yeki Az Gozine Hara Entekhab Kon.");
            }
        }

        scanner.close();
    }
}