package ex6_Facade.clase;

public class Pacient {

    private String nume;
    private int gradSeveritate;
    private int nrPat;

    public Pacient(String nume, int gradSeveritate, int nrPat) {
        this.nume = nume;
        this.gradSeveritate = gradSeveritate;
        this.nrPat=nrPat;
    }

    public int getNrPat() {
        return nrPat;
    }

    public String getNume() {
        return nume;
    }

    public int getGradSeveritate() {
        return gradSeveritate;
    }


}
