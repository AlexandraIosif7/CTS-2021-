package Adapter.main;

import Adapter.clase.Bilet;
import Adapter.clase.BiletAdaptorClase;
import Adapter.clase.BiletAdaptorObiect;
import Adapter.clase.IBiletOnline;

// Exercitiul E - 5

public class Main {

    private static void rezervaSiAfiseazaBiletLaCasa(Bilet bilet){
        bilet.rezervare();
        bilet.vanzare();
    }
    private static void rezervaSiAfiseazaBiletOnline(IBiletOnline biletOnline){
        biletOnline.rezervaBiletOnline();
        biletOnline.vindeBiletOnline();
    }
    public static void main(String[] args) {

        Bilet bilet= new Bilet(30);
        rezervaSiAfiseazaBiletLaCasa(bilet);

        //rezervaSiAfiseazaBiletOnline(bilet);
        //nuu putem folosi functionalitatea online cu clasa noastra simpla Bilet si de aceea trebuie sa facem un adapter intre clase si interfata


        IBiletOnline biletAdaptat = new BiletAdaptorObiect(bilet); //adaptam biletul nostru
        rezervaSiAfiseazaBiletOnline(biletAdaptat);
        //la adapter de obiecte am nevoie de un obiect facut inainte pe care il adaptez

        //la adaptor de clase nu avem nevoie de obiect ptr ca il facem noi direct corect
        IBiletOnline biletAdaptatClase=new BiletAdaptorClase(50);
        rezervaSiAfiseazaBiletOnline(biletAdaptatClase);
    }
}
