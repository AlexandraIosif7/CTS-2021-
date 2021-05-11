package ro.ase.cts.prototype.clase;

public class Reteta implements AbstractPrototype{

    private String denumireSolutie;
    private int cantitateSolutie;

    public Reteta(String denumireSolutie, int cantitateSolutie) {
        //validari ptr campuri care consuma timp
        this.denumireSolutie = denumireSolutie;
        this.cantitateSolutie = cantitateSolutie;
    }

    private Reteta() { //il facem private ca sa nu poate fi accesat si sa fim siguri ca obiectul creat a fost validat ptr ca pe baza lui e fac apoi copiile
        //nu mai facem validari aici
        this.denumireSolutie="";
        this.cantitateSolutie=0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("denumireSolutie='").append(denumireSolutie).append('\'');
        sb.append(", cantitateSolutie=").append(cantitateSolutie);
        sb.append('}');
        return sb.toString();
    }

    //similar cu Clonable dar Clonable face shallow copy si noi am facut deep copy
    @Override
    public AbstractPrototype copiaza() {
        Reteta copie=new Reteta();

        copie.cantitateSolutie=this.cantitateSolutie;
        copie.denumireSolutie=this.denumireSolutie;

        return copie;
    }
}
