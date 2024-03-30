package lesson11.bank;

public class BankAccount {
    static int totalAccounts=0;
    String name;
    String surname;
    Integer customerNumber;

    public BankAccount(String name, String surname, Integer customerNumber) {
        this.name = name;
        this.surname = surname;
        this.customerNumber = customerNumber;
        totalAccounts++;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", customerNumber=" + customerNumber +
                '}';
    }
}
