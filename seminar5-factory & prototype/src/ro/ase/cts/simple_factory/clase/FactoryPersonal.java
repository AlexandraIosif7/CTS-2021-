package ro.ase.cts.simple_factory.clase;

public class FactoryPersonal {

    public PersonalSpital createPersonal(TipPersonal tipPersonal, String nume){
        switch(tipPersonal){
            case Asistent:
                return new Asistent(nume);
            case Brancardier:
                return new Brancardier(nume);
            case Medic:
                return new Medic(nume);
            default:
                throw new IllegalArgumentException();
        }

    }
}
