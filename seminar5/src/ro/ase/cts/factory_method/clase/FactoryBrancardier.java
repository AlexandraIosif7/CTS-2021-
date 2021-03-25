package ro.ase.cts.factory_method.clase;

public class FactoryBrancardier implements AbstractFactory {
    @Override
    public PersonalSpital getPersonal(String nume) {
        return new Brancardier(nume);
    }
}
