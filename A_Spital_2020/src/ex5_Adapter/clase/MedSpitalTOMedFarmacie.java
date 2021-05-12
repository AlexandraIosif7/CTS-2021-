package ex5_Adapter.clase;

public class MedSpitalTOMedFarmacie implements IMedicament {

   private MedicamentSpital medicamentSpital;

    public MedSpitalTOMedFarmacie(MedicamentSpital medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        this.medicamentSpital.achizitioneazaMedicament();
    }
}
