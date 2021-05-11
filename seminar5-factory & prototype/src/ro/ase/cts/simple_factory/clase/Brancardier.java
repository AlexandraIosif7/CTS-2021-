package ro.ase.cts.simple_factory.clase;

public class Brancardier extends PersonalSpital {

    public Brancardier(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Brancardier{");
        sb.append(super.getNume()).append("}");
        return sb.toString();
    }
}
