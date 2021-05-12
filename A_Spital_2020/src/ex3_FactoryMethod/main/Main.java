package ex3_FactoryMethod.main;

import ex3_FactoryMethod.clase.FactoryAsistent;
import ex3_FactoryMethod.clase.PersonalSpital;

public class Main {
    public static void main(String[] args) {
        PersonalSpital asistent= new FactoryAsistent().angajeazaPersonal("Gigel");
        asistent.afiseazaPersonal();
    }
}
