package ro.ase.cts.factory_method.clase;

public class Asistent extends PersonalSpital {
    public Asistent(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Asistent{");
        sb.append(super.getNume()).append("}");
        return sb.toString();
    }
}
