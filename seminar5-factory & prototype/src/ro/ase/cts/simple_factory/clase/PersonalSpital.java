package ro.ase.cts.simple_factory.clase;

public abstract class PersonalSpital {
    private String nume;

    public PersonalSpital(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }
}
