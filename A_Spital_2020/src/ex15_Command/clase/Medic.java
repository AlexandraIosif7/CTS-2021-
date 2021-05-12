package ex15_Command.clase;

//executant
public class Medic {
    private Pacient pacient;

    public Pacient getPacient() {
        return pacient;
    }

    public Medic(Pacient pacient) {
        this.pacient = pacient;
    }

    public void interneaza(){
        System.out.println("Pacientul "+pacient.getName()+" se interneaza!");
    }
    public void trateazaAcum(){
        System.out.println("Pacientul "+pacient.getName()+" se trateaza de urgenta!");

    }
}
