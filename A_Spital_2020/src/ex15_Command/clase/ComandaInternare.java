package ex15_Command.clase;

//comnada concreta
public class ComandaInternare extends IComanda {

    public ComandaInternare(Medic medic) {
        super(medic);
    }

    @Override
    public void executa() {
        super.medic.interneaza();
    }
}
