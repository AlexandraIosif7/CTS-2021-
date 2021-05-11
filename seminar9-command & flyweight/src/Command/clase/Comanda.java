package Command.clase;

//Comanda abstracta -am facut clasa, nu interfata, ca sa adaugam si campul masa
public abstract class Comanda {

    protected Masa masa; //protected ca sa avem acces la ea in clasele derivate

    public Comanda(Masa masa) {
        this.masa = masa;
    }

    public abstract void executa();
}
