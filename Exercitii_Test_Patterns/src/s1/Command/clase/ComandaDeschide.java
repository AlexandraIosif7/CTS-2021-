package s1.Command.clase;

public class ComandaDeschide extends Comanda {

    public ComandaDeschide(Usa usa) {
        super(usa);
    }

    @Override
    public void executa( ) {
        super.usa.deschide();
    }
}
