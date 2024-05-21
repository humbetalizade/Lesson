package lesson11.bank;

public class Main {
    public static void main(String[] args) {
        BankAccount user1 = new BankAccount("Humbet", "Alizade", 1548);
        BankAccount user2 = new BankAccount("Lale", "Memmedova", 1548);

        System.out.println(user1);
        System.out.println(user2);
        System.out.println("counts of users: " + BankAccount.totalAccounts);
    }
}
