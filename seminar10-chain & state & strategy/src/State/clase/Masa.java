package State.clase;
//Context
public class Masa {

    private Stare stare;
    private int numar;

    public Masa(int numar) {
        this.numar = numar;
        this.stare=new StareLibera();
    }

    public Stare getStare() {
        return stare;
    }

    public int getNumar() {
        return numar;
    }

    //IMPORTANT SA FIE PROTECTED SAU DEFAULT CA SA NU POATA FI APELAT DIN MAIL
    protected void setStare(Stare stare) {
        this.stare = stare;
    }

    public void rezervaMasa(){
      StareRezervata rezervata=new StareRezervata();
      rezervata.modificaStare(this);
    }
    public void ocupaMasa(){
        StareOcupata ocupata=new StareOcupata();
        ocupata.modificaStare(this);
    }
    public void elibereazaMasa(){
        StareLibera libera= new StareLibera();
        libera.modificaStare(this);
    }
}
