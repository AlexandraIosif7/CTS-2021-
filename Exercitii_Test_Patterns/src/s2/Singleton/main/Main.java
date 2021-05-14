package s2.Singleton.main;

import s2.Singleton.clase.LocuintaNoua;
import s2.Startegy.clase.Locuinta;

public class Main {
    public static void main(String[] args) {

        LocuintaNoua locuintaNoua=new LocuintaNoua("lujeruli",450);
        System.out.println(locuintaNoua.toString());

        LocuintaNoua locuintaNoua2=new LocuintaNoua("grozavesti",400);
        System.out.println(locuintaNoua2.toString());

        LocuintaNoua locuintaNoua3=new LocuintaNoua("victoriei",50);
        System.out.println(locuintaNoua3.toString());

    }
}
