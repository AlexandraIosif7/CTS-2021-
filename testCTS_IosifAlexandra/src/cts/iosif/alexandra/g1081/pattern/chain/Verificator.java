package cts.iosif.alexandra.g1081.pattern.chain;

public abstract class Verificator {

    private Verificator succesor;

    public void setSuccesor(Verificator verificator){
        this.succesor=verificator;
    }
    public Verificator getSuccesor() {
        return succesor;
    }
    public abstract void verifica(FisaAccident fisa);
}
