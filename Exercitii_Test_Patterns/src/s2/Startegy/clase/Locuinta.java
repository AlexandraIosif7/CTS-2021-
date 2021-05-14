package s2.Startegy.clase;

public class Locuinta {
    private String locatie;
    private int pretMinPerMetru;
    private int pretMinPerCamere;

    public Locuinta() {
    }

    public Locuinta(String locatie, int pretMinPerMetru, int pretMinPerCamere) {
        this.locatie = locatie;
        this.pretMinPerMetru = pretMinPerMetru;
        this.pretMinPerCamere = pretMinPerCamere;
    }

    public String getLocatie() {
        return locatie;
    }

    public int getPretMinPerMetru() {
        return pretMinPerMetru;
    }

    public int getPretMinPerCamere() {
        return pretMinPerCamere;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public void setPretMinPerMetru(int pretMinPerMetru) {
        this.pretMinPerMetru = pretMinPerMetru;
    }

    public void setPretMinPerCamere(int pretMinPerCamere) {
        this.pretMinPerCamere = pretMinPerCamere;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Locuinta{");
        sb.append("locatie='").append(locatie).append('\'');
        sb.append(", pretMinPerMetru=").append(pretMinPerMetru);
        sb.append(", pretMinPerCamere=").append(pretMinPerCamere);
        sb.append('}');
        return sb.toString();
    }
}
