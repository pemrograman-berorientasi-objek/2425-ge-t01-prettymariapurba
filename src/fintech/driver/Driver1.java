package fintech.driver;

import java.util.Scanner;

/**
 * @author 12S23042 Pretty Maria Purba
 * @author 12S23049 Clarissa Manurung
 */
public class Driver1 {

    public static void main(String[] _args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input
        String command = scanner.nextLine();
        String owner = scanner.nextLine();
        String accountName = scanner.nextLine();

        // Validasi perintah
        if (command.equals("create-account")) {
            double balance = 0.0;
            System.out.println(accountName + "|" + owner + "|" + balance);
        }

        scanner.close();
    }
}
