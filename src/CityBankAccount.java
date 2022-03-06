public class CityBankAccount implements BankAccount{
    private final String name;
    private final String surname;
    private int balance;
    private final String accountNumber;
    private String pinCode;

    public CityBankAccount(String name, String surname, int balance, String accountNumber, String pinCode) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
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
        return "CityBankAccount{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", balance=" + getBalance() +
                ", accountNumber='" + getAccountNumber() + '\'' +
                ", pinCode='" + getPinCode() + '\'' +
                '}';
    }
}
