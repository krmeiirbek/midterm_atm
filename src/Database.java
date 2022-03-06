public class Database {
    public static BankAccount[] allAccounts = new BankAccount[10];
    static {
        allAccounts[0] = new CityBankAccount("Bill1","Gates1",10000,"KZ010126121","0101");
        allAccounts[1] = new CityBankAccount("Bill2","Gates2",20000,"KZ010126122","0102");
        allAccounts[2] = new CityBankAccount("Bill3","Gates3",30000,"KZ010126123","0103");
        allAccounts[3] = new CityBankAccount("Bill4","Gates4",40000,"KZ010126124","0104");
        allAccounts[4] = new CityBankAccount("Bill5","Gates5",50000,"KZ010126125","0105");
        allAccounts[5] = new NationalBankAccount("Bill6",60000,"KZ010126126","0106");
        allAccounts[6] = new NationalBankAccount("Bill7",70000,"KZ010126127","0107");
        allAccounts[7] = new NationalBankAccount("Bill8",80000,"KZ010126128","0108");
        allAccounts[8] = new NationalBankAccount("Bill9",90000,"KZ010126129","0109");
        allAccounts[9] = new NationalBankAccount("Bill10",100000,"KZ010126120","0110");
    }
}
