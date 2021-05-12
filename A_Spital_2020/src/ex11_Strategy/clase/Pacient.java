package ex11_Strategy.clase;

public class Pacient {
    private int sumaDePlata;
    private IPlata modDePlata=new PlataCash();

    public Pacient(int sumaDePlata) {
        this.sumaDePlata = sumaDePlata;
    }
    public void setModDePlata(IPlata modDePlata) {
        this.modDePlata = modDePlata;
    }

    public void platesteInternare(){
        this.modDePlata.plateste(this.sumaDePlata);
    }
}
