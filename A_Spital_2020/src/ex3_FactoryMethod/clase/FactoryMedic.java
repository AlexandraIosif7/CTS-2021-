package ex3_FactoryMethod.clase;

public class FactoryMedic implements IFactory {
    @Override
    public PersonalSpital angajeazaPersonal(String nume) {
        return new Medic(nume);
    }
}
