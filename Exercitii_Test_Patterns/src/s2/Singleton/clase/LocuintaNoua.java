package s2.Singleton.clase;

public class LocuintaNoua {
    private int codUnic;
    private String locatie;
    private int pret;

    public LocuintaNoua(String locatie, int pret) {
        this.locatie = locatie;
        this.pret = pret;
        this.codUnic=GeneratorCoduri.getInstance().genereazaCodUnic();
    }

    public int getCodUnic() {
        return codUnic;
    }

    public String getLocatie() {
        return locatie;
    }

    public int getPret() {
        return pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LocuintaNoua{");
        sb.append("codUnic=").append(codUnic);
        sb.append(", locatie='").append(locatie).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
