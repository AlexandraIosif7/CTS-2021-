package ex3_FactoryMethod.clase;

public class FactoryAsistent implements IFactory {
    @Override
    public PersonalSpital angajeazaPersonal(String nume) {
        return new Asistent(nume);
    }
}
