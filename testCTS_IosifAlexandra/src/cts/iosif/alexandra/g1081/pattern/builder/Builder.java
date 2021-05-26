package cts.iosif.alexandra.g1081.pattern.builder;

public class Builder implements AbstractBuilder {

    private CursDeFitness curs;

    public Builder() {
        curs=new CursDeFitness(null,0,null,0,0,false,false,false,false);
    }

    public Builder setAntrenor(String antrenor){
        this.curs.setAntrenor(antrenor);
        return this;
    }
    public Builder setDurata(int value){
        this.curs.setDurata(value);
        return this;
    }
    public Builder setNrMaxParticipanti(int value){
        this.curs.setNrMaxParticipanti(value);
        return this;
    }
    public Builder setPret(int value){
        this.curs.setPret(value);
        return this;
    }
    public Builder setNivelDificultate(NivelDificultate nivel){
        this.curs.setNivelDificultate(nivel);
        return this;
    }
    public Builder setFlotari(boolean value){
        this.curs.setFlotari(value);
        return this;
    }
    public Builder setSquats(boolean value){
        this.curs.setSquats(value);
        return this;
    }
    public Builder setPlank(boolean value){
        this.curs.setPlank(value);
        return this;
    }
    public Builder setRidicari(boolean value){
        this.curs.setRidicari(value);
        return this;
    }

    @Override
    public CursDeFitness construieste() {
        return this.curs;
    }
}
