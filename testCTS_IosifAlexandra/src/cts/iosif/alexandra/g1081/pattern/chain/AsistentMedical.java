package cts.iosif.alexandra.g1081.pattern.chain;

public class AsistentMedical extends Verificator {
    @Override
    public void verifica(FisaAccident fisa) {
        if(fisa.isSePoateDeplasa() && !fisa.isAreMembreRupte() && !fisa.isAreRaniDeschise()){
            System.out.println("Accidentarea este usoara si este tratata de asistentul medical ptr fisa cu numele " + fisa.getNumePersoana());
            System.out.println("->S-a completata o fisa pentru aceasta accidentare.");
        }
        else if(super.getSuccesor()!=null){
            super.getSuccesor().verifica(fisa);
        }
    }
}
