package ro.ase.cts.factory_method.main;

import ro.ase.cts.factory_method.clase.*;

public class Main {

    //asta ar fi clientul, aceasta functie. Primeste doar un factory abstract, nu stie tipul concret
    public static void afisareInfoPersonalSpital(AbstractFactory factory, String nume){

        PersonalSpital personalSpital=factory.getPersonal(nume);

        System.out.println(personalSpital.toString());
    }
    public static void main(String[] args) {

        afisareInfoPersonalSpital(new FactoryAsistent() ,"Ana");
        afisareInfoPersonalSpital(new FactoryBrancardier() ,"Bogdan");
        afisareInfoPersonalSpital(new FactoryInfirmier() ,"Ciprian");

    }
}
