package s2.Chain.clase;

public class Client {

    private int varsta;
    private int salariu;
    private String nume;

    public Client(int varsta, int salariu, String nume) {
        this.varsta = varsta;
        this.salariu = salariu;
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public int getSalariu() {
        return salariu;
    }

    public String getNume() {
        return nume;
    }

}
