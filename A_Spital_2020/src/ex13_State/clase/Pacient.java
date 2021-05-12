package ex13_State.clase;

public class Pacient {

    private Stare stare;
    private String nume;
    private int gradSeveritate;

    public Pacient(String nume, int grad) {
        this.gradSeveritate = grad;
        this.nume = nume;
        this.stare=new Internat();
    }

    protected void setStare(Stare stare) {
        this.stare = stare;
    }

    public Stare getStare() {
        return stare;
    }

    public String getNume() {
        return nume;
    }

    public int getGradSeveritate() {
        return gradSeveritate;
    }

    public void interneaza(){
        Internat internat= new Internat();
        internat.modificaStare(this);
    }
    public void subObservatie(){
        SubObservatie subObservatie= new SubObservatie();
        subObservatie.modificaStare(this);
    }
    public void externeaza(){
        Externat externat= new Externat();
        externat.modificaStare(this);
    }

    public void setGradSeveritate(int gradSeveritate) {
        this.gradSeveritate = gradSeveritate;
    }
}
