package s3.Factory.clase;

public abstract class AObiectivTuristic {
    private String nume;

    public AObiectivTuristic(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public abstract void afiseazaDetalii();
}
