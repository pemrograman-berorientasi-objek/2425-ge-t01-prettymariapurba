package fintech.model;

/**
 * @author 12S23042 Pretty Maria Purba
 * @author 12S23049 Clarissa Manurung
 */
public class Account {

    private String accountName;
    private String owner;
    private double balance;

    public Account(String _accountName, String _owner, double _balance) {
        this.accountName = _accountName;
        this.owner = _owner;
        this.balance = _balance;
    }

    public String getAccountName() {
        this.accountName = accountName;
        this.owner = owner;
        this.balance = balance;
        return this.accountName;
    }

    public String getOwner() {
        this.accountName = accountName;
        this.owner = owner;
        this.balance = balance;
        return this.owner;
    }

    public double getBalance() {
        this.accountName = accountName;
        this.owner = owner;
        this.balance = balance;
        return this.balance;
    }

    public void setAccountName(String _accountName) {
        this.accountName = _accountName;
    }

    public void setOwner(String _owner) {
        this.owner = _owner;
    }

    public void setBalance(double _balance) {
        this.balance = _balance;
    }

    public void deposit(double _amount) {
        this.balance += _amount;
    }

    public void withdraw(double _amount) {
        this.balance -= _amount;
    }

    public void transfer(Account _account, double _amount) {
        this.balance -= _amount;
        _account.deposit(_amount);
    }

    public String toString() {
        return this.accountName + "|" + this.owner + "|" + this.balance;
    }




}