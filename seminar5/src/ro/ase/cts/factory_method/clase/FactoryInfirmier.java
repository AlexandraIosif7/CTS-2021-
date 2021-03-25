package ro.ase.cts.factory_method.clase;

public class FactoryInfirmier implements AbstractFactory {
    @Override
    public PersonalSpital getPersonal(String nume) {
        return new Infirmier(nume);
    }
}
