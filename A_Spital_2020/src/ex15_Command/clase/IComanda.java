package ex15_Command.clase;

//comanda abstracta
public abstract class IComanda {

    protected Medic medic;

    public IComanda(Medic medic) {
        this.medic = medic;
    }
    public abstract void executa();
}
