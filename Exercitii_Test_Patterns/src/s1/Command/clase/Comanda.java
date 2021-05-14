package s1.Command.clase;

public abstract class Comanda {
    protected Usa usa;

    public Comanda(Usa usa) {
        this.usa = usa;
    }

    public abstract void executa();
}
