public class NationalBankAccount implements BankAccount{
    private final String fullName;
    private int balance;
    private final String accountNumber;
    private String pinCode;

    public NationalBankAccount(String fullName, int balance, String accountNumber, String pinCode) {
        this.fullName = fullName;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String getPinCode() {
        return pinCode;
    }

    @Override
    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public int totalBalance() {
        return getBalance();
    }

    @Override
    public void creditBalance(int credit) {
        balance -= credit;
    }

    @Override
    public void debetBalance(int debet) {
        balance += debet;
    }

    @Override
    public String accountData() {
        return "NationalBankAccount{" +
                "fullName='" + fullName + '\'' +
                ", balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}
