package ex13_State.clase;

public class Internat implements Stare {
    @Override
    public void modificaStare(Pacient pacient) {
        if(!(pacient.getStare() instanceof Externat) ){
            System.out.println("Pacientul "+pacient.getNume()+" este deja internat!");
        }else
        {
            pacient.setStare(this);
            System.out.println("Pacientul "+pacient.getNume()+" tocmai a fost internat");
        }

    }
}
