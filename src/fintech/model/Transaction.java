package fintech.model;

/**
 * @author 12S23042 Pretty Maria Purba
 * @author 12S23049 Clarissa Manurung
 */
public class Transaction {

    private String transactionType;
    private double amount;
    private String accountName;

    public Transaction(String _transactionType, double _amount, String _accountName) {
        this.transactionType = _transactionType;
        this.amount = _amount;
        this.accountName = _accountName;
    }

    public String getTransactionType() {
        this.transactionType = transactionType;
        this.amount = amount;
        this.accountName = accountName;
        return this.transactionType;
    }

    public double getAmount() {
        this.transactionType = transactionType;
        this.amount = amount;
        this.accountName = accountName;
        return this.amount;
    }

    public String getAccountName() {
        this.transactionType = transactionType;
        this.amount = amount;
        this.accountName = accountName;
        return this.accountName;
    }

    public void setTransactionType(String _transactionType) {
        this.transactionType = _transactionType;
    }

    public void setAmount(double _amount) {
        this.amount = _amount;
    }

    public void setAccountName(String _accountName) {
        this.accountName = _accountName;
    }

}