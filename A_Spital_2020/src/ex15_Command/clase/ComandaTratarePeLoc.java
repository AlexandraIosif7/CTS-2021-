package ex15_Command.clase;

//comanda concreta
public class ComandaTratarePeLoc extends IComanda {

    public ComandaTratarePeLoc(Medic medic) {
        super(medic);
    }

    @Override
    public void executa() {
        super.medic.trateazaAcum();
    }
}
