package cts.iosif.alexandra.g1081.pattern.chain;

public class Spital extends Verificator {
    @Override
    public void verifica(FisaAccident fisa) {
        if(fisa.isAreRaniDeschise()){
            System.out.println("Accidentarea este grava si este tratata la spital ptr fisa cu numele " + fisa.getNumePersoana());
            System.out.println("->S-a completata o fisa pentru aceasta accidentare.");

        }
        else if(super.getSuccesor()!=null){
            super.getSuccesor().verifica(fisa);
        }
    }
}
