package fintech.driver;

import java.util.*;

/**
 * @author 12S23042 Pretty Maria Purba
 * @author 12S23049 Clarissa Manurung
 */
public class Driver2 {
    static class Account {
        String name;
        String username;
        double balance;

        Account(String name, String username) {
            this.name = name;
            this.username = username;
            this.balance = 0.0;
        }
    }

    static class Transaction {
        static int idCounter = 0;
        int id;
        String accountName;
        double amount;
        String postedAt;
        String note;
        double balance;

        Transaction(String accountName, double amount, String postedAt, String note, double balance) {
            this.id = ++idCounter;
            this.accountName = accountName;
            this.amount = amount;
            this.postedAt = postedAt;
            this.note = note;
            this.balance = balance;
        }
    }

    public static void main(String[] _args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Account> accounts = new HashMap<>();
        List<Transaction> transactions = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String command = scanner.nextLine();
            if (command.equals("create-account")) {
                String name = scanner.nextLine();
                String username = scanner.nextLine();
                accounts.put(username, new Account(name, username));
            } else if (command.equals("create-transaction")) {
                String accountName = scanner.nextLine();
                double amount = Double.parseDouble(scanner.nextLine());
                String postedAt = scanner.nextLine();
                String note = scanner.nextLine();
                
                if (accounts.containsKey(accountName)) {
                    Account account = accounts.get(accountName);
                    account.balance += amount;
                    Transaction transaction = new Transaction(accountName, amount, postedAt, note, account.balance);
                    transactions.add(transaction);


                    System.out.println(account.username + "|" + account.name + "|0.0");
                    System.out.println(transaction.id + "|" + accountName + "|" + amount + "|" + postedAt + "|" + note + "|" + account.balance);
                }
            }
        }
        scanner.close();
    }
}
