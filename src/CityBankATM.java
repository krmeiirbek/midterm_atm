import java.util.Scanner;

public class CityBankATM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            BankAccount currentAccount = null;
            System.out.println("Enter your account number: ");
            String accountNumber = in.next();
            if (accountNumber.equalsIgnoreCase("exit")) break;
            System.out.println("Enter your pin code: ");
            String pinCode = in.next();
            boolean isHave = false;
            for (int i = 0; i < Database.allAccounts.length; i++) {
                if (Database.allAccounts[i].getAccountNumber().equals(accountNumber) && Database.allAccounts[i].getPinCode().equals(pinCode)) {
                    isHave = true;
                    currentAccount = Database.allAccounts[i];
                    break;
                }
            }
            if (isHave) {
                if (currentAccount instanceof CityBankAccount) {
                    while (true) {
                        System.out.println("""
                                PRESS [1] TO CASH WITHDRAWAL
                                PRESS [2] TO VIEW BALANCE
                                PRESS [3] TO CHANGE PIN CODE
                                PRESS [4] TO CASH IN ACCOUNT
                                PRESS [5] TO VIEW ACCOUNT DATA
                                PRESS [6] TO EXIT""");
                        int choice = in.nextInt();
                        if (choice == 1) {
                            System.out.println("Enter cash withdrawal: ");
                            int cash = in.nextInt();
                            if (currentAccount.totalBalance() >= cash) {
                                currentAccount.creditBalance(cash);
                                System.out.println("Successfully completed!");
                            } else
                                System.out.println("Your balance small than (cash withdrawal) where you want to get");
                        } else if (choice == 2) {
                            System.out.println("Your balance: " + currentAccount.totalBalance());
                        } else if (choice == 3) {
                            System.out.println("Old pin code: ");
                            String oldPinCode = in.next();
                            if (currentAccount.getPinCode().equals(oldPinCode)) {
                                System.out.println("New pin code: ");
                                String newPinCode = in.next();
                                currentAccount.setPinCode(newPinCode);
                                System.out.println("Pin code changed!");
                            } else System.out.println("Error old pin code!");
                        } else if (choice == 4) {
                            System.out.println("Enter the cash: ");
                            int cash = in.nextInt();
                            currentAccount.debetBalance(cash);
                            System.out.println("Operation successfully completed!");
                        } else if (choice == 5) {
                            System.out.println(currentAccount.accountData());
                        } else if (choice == 6) break;
                        else System.out.println("Error combination!");
                    }
                } else {
                    while (true) {
                        System.out.println("""
                                PRESS [1] TO CASH WITHDRAWAL
                                PRESS [2] TO VIEW BALANCE
                                PRESS [3] TO EXIT""");
                        int choice = in.nextInt();
                        if (choice == 1) {
                            System.out.println("Enter cash withdrawal: ");
                            int cash = in.nextInt();
                            if (currentAccount.totalBalance() >= cash + 200) {
                                currentAccount.creditBalance(cash + 200);
                                System.out.println("Successfully completed!");
                            } else
                                System.out.println("Your balance small than (cash withdrawal + 200) where you want to get");
                        } else if (choice == 2) {
                            System.out.println("Your balance: " + currentAccount.totalBalance());
                        } else if (choice == 3) break;
                        else System.out.println("Error combination!");
                    }
                }
            } else System.out.println("Error pin or account number");
        }
    }
}
