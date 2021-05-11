package ro.ase.cts.factory_method.clase;

public class FactoryMedic implements AbstractFactory {
    @Override
    public PersonalSpital getPersonal(String nume) {
        return new Medic(nume);
    }
}
