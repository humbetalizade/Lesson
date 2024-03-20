package lesson10;

import com.sun.jdi.ClassObjectReference;

public class Main {
    public static void main(String[] args) {
        String a="AzerbaijaN";
        String b= "       Lorem assajokjs ksjdfkasdokl kmkajsdkkjasd kasdjakm    oisdjka kjasdkmaldkas    alksjdla   ";
        //  Sözün uzunluğunu tapır
        System.out.println(a.length());

        //  Hərfləri böyüklə yazır
        System.out.println(a.toUpperCase());

        //  Hərfləri kiçiklə yazır
        System.out.println(a.toLowerCase());

        //  Sözün və ya mətnini "A" ilə başlayıb, başlamamasını yoxlayır
        System.out.println(a.startsWith("A"));

        //  Sözün və ya mətnini "Z" ilə bitib, bitməməsini yoxlayır
        System.out.println(a.endsWith("Z"));

        //  İstədiyimiz simvolu digəri ilə əvəzləyir
        System.out.println(a.replace('A','T'));

        //  Qeyd olunan simvolun ilk istifadə olunduğu sözün indexini tapır.
        System.out.println(b.indexOf("o"));

        //  Mətndə qeyd olunan indexlər arasındakı simvolları tapır
        System.out.println(b.substring(5, 10));

        //  Əvvəldəki və sonrakı boşluqları silir
        System.out.println(b.trim());
    }
}
