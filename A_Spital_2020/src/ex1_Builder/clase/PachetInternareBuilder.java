package ex1_Builder.clase;

public class PachetInternareBuilder implements IBuilder {

    private PachetInternare pachetInternare;

    public PachetInternareBuilder(String nume) {
        this.pachetInternare = new PachetInternare(nume,false,false,false,false);
    }

    @Override
    public PachetInternare build() {
        return this.pachetInternare;
    }

    public PachetInternareBuilder setPat(boolean arePat){
        pachetInternare.setArePatRabatabil(arePat);
        return this;
    }
    public PachetInternareBuilder setMicDejun(boolean areMicDejun){
        pachetInternare.setAreMicDejunInclus(areMicDejun);
        return this;
    }public PachetInternareBuilder setPapuci(boolean arePapuci){
        pachetInternare.setArePapuci(arePapuci);
        return this;
    }public PachetInternareBuilder setHalat(boolean areHalat){
        pachetInternare.setAreHalat(areHalat);
        return this;
    }
}
