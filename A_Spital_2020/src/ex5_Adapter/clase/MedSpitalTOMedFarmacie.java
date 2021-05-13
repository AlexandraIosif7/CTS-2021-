package ex5_Adapter.clase;

public class MedSpitalTOMedFarmacie implements IMedicament {

   private MedicamentSpital medicamentSpital;

    public MedSpitalTOMedFarmacie(MedicamentSpital medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }

    //puteam ca inainte sa apelez achizitioneazaMedicament si iau medicamentul si sa il adaug inlista cu retete si asa sunt sigura ca
    //verificarea retetei va returna mereu true

    //sau alice a zis ca a facut un boolean cu areReteta si l-a setat dupa dorinta!!!
    @Override
    public void cumparaMedicament() {
        this.medicamentSpital.areReteta=true;
        this.medicamentSpital.achizitioneazaMedicament();
    }
}
