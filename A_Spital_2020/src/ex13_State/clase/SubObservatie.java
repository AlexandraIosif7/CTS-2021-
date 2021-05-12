package ex13_State.clase;

public class SubObservatie implements Stare {
    @Override
    public void modificaStare(Pacient pacient) {
        if(pacient.getStare() instanceof Internat ){
            if(pacient.getGradSeveritate()>5) {
                pacient.setStare(this);
                System.out.println("Pacientul " + pacient.getNume() + " a fost pus sub observatie");
            }
            else
            {System.out.println("Pacientul " + pacient.getNume() + " nu are o stare destul de grava");}
        }
        else if(pacient.getStare() instanceof SubObservatie)
        {
            System.out.println("Pacientul "+pacient.getNume()+" este deja sub observatie");
        }
        else{
            System.out.println("Pacientul "+pacient.getNume()+" nu este internat!");
        }
    }
}
