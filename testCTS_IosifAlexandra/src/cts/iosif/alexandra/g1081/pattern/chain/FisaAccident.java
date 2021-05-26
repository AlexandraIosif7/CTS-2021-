package cts.iosif.alexandra.g1081.pattern.chain;

public class FisaAccident {
    private String numePersoana;
    private int varsta;
    private boolean esteConstient;
    private boolean sePoateDeplasa;
    private boolean areMembreRupte;
    private boolean areRaniDeschise;

    public FisaAccident(String numePersoana, int varsta, boolean esteConstient, boolean sePoateDeplasa, boolean areMembreRupte, boolean areRaniDeschise) {
        this.numePersoana = numePersoana;
        this.varsta = varsta;
        this.esteConstient = esteConstient;
        this.sePoateDeplasa = sePoateDeplasa;
        this.areMembreRupte = areMembreRupte;
        this.areRaniDeschise = areRaniDeschise;
    }

    public String getNumePersoana() {
        return numePersoana;
    }

    public int getVarsta() {
        return varsta;
    }

    public boolean isEsteConstient() {
        return esteConstient;
    }

    public boolean isSePoateDeplasa() {
        return sePoateDeplasa;
    }

    public boolean isAreMembreRupte() {
        return areMembreRupte;
    }

    public boolean isAreRaniDeschise() {
        return areRaniDeschise;
    }
}
