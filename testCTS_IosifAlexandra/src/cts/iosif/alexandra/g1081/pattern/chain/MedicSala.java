package cts.iosif.alexandra.g1081.pattern.chain;

public class MedicSala extends Verificator {
    @Override
    public void verifica(FisaAccident fisa) {
        if(fisa.isAreMembreRupte() && !fisa.isAreRaniDeschise() ){
            System.out.println("Accidentarea este medie si este tratata de medicul salii de fitness ptr fisa cu numele " + fisa.getNumePersoana());
            System.out.println("->S-a completata o fisa pentru aceasta accidentare.");
        }
        else if(fisa.isSePoateDeplasa() && !fisa.isAreMembreRupte() && !fisa.isAreRaniDeschise()){
            System.out.println("Accidentarea este usoara si este tratata de medicul salii de fitness (nu avem asistent) ptr fisa cu numele " + fisa.getNumePersoana());
            System.out.println("->S-a completata o fisa pentru aceasta accidentare.");
        }
        else if(super.getSuccesor()!=null){
            super.getSuccesor().verifica(fisa);
        }
    }
}
