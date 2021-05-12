package ex9_Proxy.clase;

public class Pacient implements IPacient{

    private String nume;
    private int varsta;
    private boolean areAsigurare;
    private boolean esteInternat;

    public Pacient(String nume, int varsta, boolean areAsigurare, boolean esteInternat) {
        this.nume = nume;
        this.varsta = varsta;
        this.areAsigurare = areAsigurare;
        this.esteInternat = esteInternat;
    }

    public void setEsteInternat(boolean esteInternat) {
        this.esteInternat = esteInternat;
    }

    public boolean isEsteInternat() {
        return esteInternat;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public boolean isAreAsigurare() {
        return areAsigurare;
    }

    @Override
    public void interneaza() {
        setEsteInternat(true);
        System.out.println("Pacientul "+nume+" a fost internat!");
    }
}
