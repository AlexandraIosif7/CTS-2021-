package s1.Command.clase;

public class ComandaInchide extends Comanda {

    public ComandaInchide(Usa usa) {
        super(usa);
    }

    @Override
    public void executa( ) {
        super.usa.inchide();
    }
}
