package lesson10.homework;

public class Accounts {
    int matthewsAccount=1000;
    int myAccount=0;
    public int getMyAccount(){
        myAccount=matthewsAccount-900;
        return myAccount;
    }
    public int getMatthewsAccount(){
        matthewsAccount=matthewsAccount-100;
        return matthewsAccount;
    }
}
