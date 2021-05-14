package s3.Factory.clase;

public class FactoryMuzeu implements Factory {

    @Override
    public AObiectivTuristic creazaObiectiv(String nume, int nr) {
        return new Muzeu(nume,nr);
    }
}
