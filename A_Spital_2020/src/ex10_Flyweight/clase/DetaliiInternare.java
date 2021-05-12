package ex10_Flyweight.clase;

//starea temporara
public class DetaliiInternare {
    private int nrSalon;
    private int nrPat;
    private int nrZile;

    public DetaliiInternare(int nrSalon, int nrPat, int nrZile) {
        this.nrSalon = nrSalon;
        this.nrPat = nrPat;
        this.nrZile = nrZile;
    }

    public int getNrSalon() {
        return nrSalon;
    }

    public void setNrSalon(int nrSalon) {
        this.nrSalon = nrSalon;
    }

    public int getNrPat() {
        return nrPat;
    }

    public void setNrPat(int nrPat) {
        this.nrPat = nrPat;
    }

    public int getNrZile() {
        return nrZile;
    }

    public void setNrZile(int nrZile) {
        this.nrZile = nrZile;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("->");
        sb.append("nrSalon=").append(nrSalon);
        sb.append(", nrPat=").append(nrPat);
        sb.append(", nrZile=").append(nrZile);
        return sb.toString();
    }
}
