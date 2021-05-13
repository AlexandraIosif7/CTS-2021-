package Memento.main;

import Memento.clase.ManegerMemento;
import Memento.clase.Meci;


public class Main {
    public static void main(String[] args) {

        Meci meci= new Meci("EchipaGazda", "EchipaOaspeti",200,200,10,5);

        ManegerMemento managerMemento= new ManegerMemento();
        managerMemento.adaugaMemento(meci.creazaMemento());

        meci.setNrSpectatori(180);
        managerMemento.adaugaMemento(meci.creazaMemento());

        System.out.println( meci.toString());
        meci.seteazaMemento(managerMemento.cereUnMemento(0));
        System.out.println(meci.toString());
        meci.seteazaMemento(managerMemento.cereUltimulMemento());
        System.out.println(meci.toString());

    }
}
