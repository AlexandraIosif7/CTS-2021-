package ex2_SimpleFactory.clase;

public class PersonalSpitalFactory {

    public PersonalSpital angajeazaPersonal(TipPersonal tipPersonal, String nume){
        switch (tipPersonal){
            case Brancardier:
                return new Brancardier(nume);
            case Asistent:
                return new Asistent(nume);
            case Medic:
                return new Medic(nume);
            default:
                throw new IllegalArgumentException();
        }
    }
}
