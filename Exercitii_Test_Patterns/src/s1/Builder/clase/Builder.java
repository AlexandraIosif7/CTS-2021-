package s1.Builder.clase;

public class Builder implements AbstractBuilder {

    private BarieraInteligenta barieraInteligenta;

    public Builder() {
       this.barieraInteligenta=new BarieraInteligenta(false,false,false,false);
    }

    public Builder setSenzorDistanta(boolean bol){
        this.barieraInteligenta.setSenzorDistanta(bol);
        return this;
    }
    public Builder setSenzorCard(boolean bol){
        this.barieraInteligenta.setSenzorCard(bol);
        return this;
    }
    public Builder setButonBlocare(boolean bol){
        this.barieraInteligenta.setButonBlocare(bol);
        return this;
    }
    public Builder setModulPlata(boolean bol){
        this.barieraInteligenta.setModulPlata(bol);
        return this;
    }
    @Override
    public BarieraInteligenta build() {
        return barieraInteligenta;
    }
}
