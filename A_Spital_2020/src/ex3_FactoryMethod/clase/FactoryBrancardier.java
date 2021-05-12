package ex3_FactoryMethod.clase;

public class FactoryBrancardier implements IFactory {
    @Override
    public PersonalSpital angajeazaPersonal(String nume) {
        return new Brancardier(nume);
    }
}
