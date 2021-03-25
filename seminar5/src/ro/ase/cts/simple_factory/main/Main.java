package ro.ase.cts.simple_factory.main;

import ro.ase.cts.simple_factory.clase.Asistent;
import ro.ase.cts.simple_factory.clase.FactoryPersonal;
import ro.ase.cts.simple_factory.clase.PersonalSpital;
import ro.ase.cts.simple_factory.clase.TipPersonal;

public class Main {

    public static void main(String[] args) {

        FactoryPersonal factoryPersonal=new FactoryPersonal();

        PersonalSpital asistent = factoryPersonal.createPersonal(TipPersonal.Asistent,"Maria");
        PersonalSpital medic = factoryPersonal.createPersonal(TipPersonal.Medic,"Mihai");

        System.out.println(asistent.toString());
        System.out.println(medic.toString());
    }
}
