package Adapter.clase;

//clasa care exista deja si care se adapteaza la contextul nou
public class Bilet {

    private float pret;

    public Bilet(float pret) {
        super();
        this.pret = pret;
    }

    public void vanzare(){
        System.out.println("S-a vandut biletul: " + this.pret);
    }
    public void rezervare(){
        System.out.println("S-a rezervat biletul: " + this.pret);
    }
}
