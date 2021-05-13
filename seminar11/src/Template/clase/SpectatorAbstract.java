package Template.clase;

public abstract class SpectatorAbstract {
    public abstract void asezareLaCoada();
    public abstract void prezintaBilet();
    public abstract void realizareControlCorporal();
    public abstract void ocupareLoc();

    //FOARTE IMPORTANT SA FIE FINALA CA SA NU POATA FI SCHIMBATA DE CLASELE CONCRETE
    public final void intrareInStadion(){
        asezareLaCoada();
        prezintaBilet();
        realizareControlCorporal();
        ocupareLoc();
    }

}
