package ex13_State.clase;

public class Externat implements Stare {
    @Override
    public void modificaStare(Pacient pacient) {
        if(!(pacient.getStare() instanceof Externat) ){
            pacient.setStare(this);
            System.out.println("Pacientul "+pacient.getNume()+" a fost externat!");
        }
        else
        {
            System.out.println("Pacientul "+pacient.getNume()+" este deja externat!");
        }
    }
}
