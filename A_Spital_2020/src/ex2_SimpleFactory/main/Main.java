package ex2_SimpleFactory.main;

import ex2_SimpleFactory.clase.PersonalSpital;
import ex2_SimpleFactory.clase.PersonalSpitalFactory;
import ex2_SimpleFactory.clase.TipPersonal;

public class Main {
    public static void main(String[] args) {

        PersonalSpitalFactory factory=new PersonalSpitalFactory();
        PersonalSpital asistent=factory.angajeazaPersonal(TipPersonal.Asistent, "Marian");
        PersonalSpital medic=factory.angajeazaPersonal(TipPersonal.Medic,"Ion");

        asistent.afiseazaPersonal();
        medic.afiseazaPersonal();
    }
}
