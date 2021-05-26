package cts.iosif.alexandra.g1081.pattern.builder;

public class CursDeFitness {
    private String antrenor;
    private int durata;
    private NivelDificultate nivelDificultate;
    private int nrMaxParticipanti;
    private int pret;
    private boolean flotari;
    private boolean squats;
    private boolean ridicari;
    private boolean plank;

    // !!! protected si la constructor
    protected CursDeFitness(String antrenor, int durata, NivelDificultate nivelDificultate, int nrMaxParticipanti, int pret, boolean flotari, boolean squats, boolean ridicari, boolean plank) {
        this.antrenor = antrenor;
        this.durata = durata;
        this.nivelDificultate = nivelDificultate;
        this.nrMaxParticipanti = nrMaxParticipanti;
        this.pret = pret;
        this.flotari = flotari;
        this.squats = squats;
        this.ridicari = ridicari;
        this.plank = plank;
    }

    protected void setAntrenor(String antrenor) {
        this.antrenor = antrenor;
    }

    protected void setDurata(int durata) {
        this.durata = durata;
    }

    protected void setNivelDificultate(NivelDificultate nivelDificultate) {
        this.nivelDificultate = nivelDificultate;
    }

    protected void setNrMaxParticipanti(int nrMaxParticipanti) {
        this.nrMaxParticipanti = nrMaxParticipanti;
    }

    protected void setPret(int pret) {
        this.pret = pret;
    }

    protected void setFlotari(boolean flotari) {
        this.flotari = flotari;
    }

    protected void setSquats(boolean squats) {
        this.squats = squats;
    }

    protected void setRidicari(boolean ridicari) {
        this.ridicari = ridicari;
    }

    protected void setPlank(boolean plank) {
        this.plank = plank;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CursDeFitness{");
        sb.append("antrenor='").append(antrenor).append('\'');
        sb.append(", durata=").append(durata);
        sb.append(", nivelDificultate=").append(nivelDificultate);
        sb.append(", nrMaxParticipanti=").append(nrMaxParticipanti);
        sb.append(", pret=").append(pret);
        sb.append(", flotari=").append(flotari);
        sb.append(", squats=").append(squats);
        sb.append(", ridicari=").append(ridicari);
        sb.append(", plank=").append(plank);
        sb.append('}');
        return sb.toString();
    }
}
