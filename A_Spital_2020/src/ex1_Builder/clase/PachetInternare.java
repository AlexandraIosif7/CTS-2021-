package ex1_Builder.clase;

public class PachetInternare {
    private String name;
    private boolean arePatRabatabil;
    private boolean areMicDejunInclus;
    private boolean arePapuci;
    private boolean areHalat;

    public PachetInternare(String name, boolean arePatRabatabil, boolean areMicDejunInclus, boolean arePapuci, boolean areHalat) {
        this.name=name;
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDejunInclus = areMicDejunInclus;
        this.arePapuci = arePapuci;
        this.areHalat = areHalat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

    public void setAreMicDejunInclus(boolean areMicDejunInclus) {
        this.areMicDejunInclus = areMicDejunInclus;
    }

    public void setArePapuci(boolean arePapuci) {
        this.arePapuci = arePapuci;
    }

    public void setAreHalat(boolean areHalat) {
        this.areHalat = areHalat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PachetInternare{");
        sb.append("name='").append(name).append('\'');
        sb.append(", arePatRabatabil=").append(arePatRabatabil);
        sb.append(", areMicDejunInclus=").append(areMicDejunInclus);
        sb.append(", arePapuci=").append(arePapuci);
        sb.append(", areHalat=").append(areHalat);
        sb.append('}');
        return sb.toString();
    }
}
