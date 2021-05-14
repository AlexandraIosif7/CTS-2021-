package s3.Factory.main;

import s3.Factory.clase.*;

public class Main {
    public static void creazaObicetivTuristic(Factory factory, String nume, int nr){
        AObiectivTuristic obiectivTuristic=factory.creazaObiectiv(nume, nr);
        obiectivTuristic.afiseazaDetalii();
    }
    public static void main(String[] args) {
        creazaObicetivTuristic(new FactoryCasaMemoriala(),"Ion Kuca Caragiale", 20);
        creazaObicetivTuristic(new FactoryGradina(),"Gradina Botanica Bucuresti", 250);
        creazaObicetivTuristic(new FactoryMuzeu(),"Antipa", 30);

    }

}
