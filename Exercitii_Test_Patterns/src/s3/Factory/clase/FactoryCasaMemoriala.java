package s3.Factory.clase;

public class FactoryCasaMemoriala implements Factory {

    @Override
    public AObiectivTuristic creazaObiectiv(String nume, int nr) {
        return new CasaMemoriala(nume,nr);
    }
}
