package cts.iosif.alexandra.g1081.pattern.chain;

public class Antrenor extends Verificator {
    @Override
    public void verifica(FisaAccident fisa) {
        if(fisa.isEsteConstient()){
            System.out.println("Antrenorul a decis ca NU este vorba de o accidentare ptr fisa cu numele " + fisa.getNumePersoana());
        }
        else if(super.getSuccesor()!=null){
            super.getSuccesor().verifica(fisa);
        }
    }
}
