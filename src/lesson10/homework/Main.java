package lesson10.homework;

public class Main {
    public static void main(String[] args) {
        Accounts accounts=new Accounts();
        System.out.println("My before account: " + accounts.myAccount);
        System.out.println("Matthews's before account: " + accounts.matthewsAccount);


        System.out.println("My last account: "+accounts.getMyAccount());
        System.out.println("Matthews's last account: "+accounts.getMatthewsAccount());
    }
}
