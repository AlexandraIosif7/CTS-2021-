package s3.Factory.clase;

public class Gradina extends AObiectivTuristic {

    private  int nrSpecii;
    public Gradina(String nume, int nr) {
        super(nume);
        this.nrSpecii=nr;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Gradina botanica "+super.getNume()+" are "+nrSpecii+" specii de plante");

    }
}
