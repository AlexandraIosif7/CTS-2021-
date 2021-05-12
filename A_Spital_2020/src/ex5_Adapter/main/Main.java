package ex5_Adapter.main;

import ex5_Adapter.clase.IMedicament;
import ex5_Adapter.clase.MedSpitalTOMedFarmacie;
import ex5_Adapter.clase.MedicamentFarmacie;
import ex5_Adapter.clase.MedicamentSpital;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        //la farmacie fara reteta
        MedicamentFarmacie medicamentFarmacie=new MedicamentFarmacie("Paracetamol");
        medicamentFarmacie.cumparaMedicament();


        //la spital cu reteta
        List<String> reteta= new ArrayList<>(Arrays.asList("Aspirina","Nospa"));
        MedicamentSpital medicamentSpital=new MedicamentSpital("Nospa",reteta);
        medicamentSpital.achizitioneazaMedicament();

        //la farmacie cu reteta
        IMedicament medicamentSpitalAdaptatLaMedFarmacie = new MedSpitalTOMedFarmacie(medicamentSpital);
        medicamentSpitalAdaptatLaMedFarmacie.cumparaMedicament();

    }
}
