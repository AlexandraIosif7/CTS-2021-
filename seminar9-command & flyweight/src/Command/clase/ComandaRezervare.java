package Command.clase;

//COMMAND CONCRET
public class ComandaRezervare extends Comanda {

    public ComandaRezervare(Masa masa) {
        super(masa);
    }

    @Override
    public void executa() {
        super.masa.rezervaMasa();
    }
}
