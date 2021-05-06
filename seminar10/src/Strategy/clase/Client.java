package Strategy.clase;

public class Client {

    private IPlata tipPlata;
    private String nume;

    public Client(String nume) {
        this.nume = nume;
        this.tipPlata = new PlataCash();
    }
    //important si obligatoriu sa avem acest setter
    public void setTipPlata(IPlata tipPlata) {
        this.tipPlata = tipPlata;
    }

    public void plateste(float suma){
        System.out.println(nume + " are de platit...");
        this.tipPlata.plateste(suma);
    }
}
