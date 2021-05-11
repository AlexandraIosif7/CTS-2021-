package ro.ase.cts.factory_method.clase;

public class FactoryAsistent implements AbstractFactory{

    @Override
    public PersonalSpital getPersonal(String nume) {
        return new Asistent(nume);
    }
}
