package s3.Factory.clase;

public class CasaMemoriala extends AObiectivTuristic {

    private int capacitateMaxima;

    public CasaMemoriala(String nume, int capacitateMaxima) {
        super(nume);
        this.capacitateMaxima=capacitateMaxima;
    }

    @Override
    public void afiseazaDetalii() {

        System.out.println("Casa memoriala "+super.getNume()+" poate gazdui maxim "+capacitateMaxima +" vizitatori de-odata");
    }

}
