package s3.Factory.clase;

public class FactoryGradina implements Factory {

    @Override
    public AObiectivTuristic creazaObiectiv(String nume, int nr) {
        return new Gradina(nume,nr);
    }
}
