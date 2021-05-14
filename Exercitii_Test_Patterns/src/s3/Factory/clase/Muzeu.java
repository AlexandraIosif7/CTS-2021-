package s3.Factory.clase;

public class Muzeu extends AObiectivTuristic {

    private int nrExpozitii;

    public Muzeu(String nume, int nr) {
        super(nume);
        this.nrExpozitii=nr;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Muzeul "+super.getNume()+" are "+nrExpozitii+" expozitii");
    }
}
