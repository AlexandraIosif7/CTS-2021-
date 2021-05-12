package ex9_Proxy.clase;

public class ProxyPacient implements IPacient {

    private Pacient pacient;

    public ProxyPacient(Pacient pacient) {
        this.pacient = pacient;
    }

    public void setPacient(Pacient pacient) {
        this.pacient = pacient;
    }

    @Override
    public void interneaza() {

        if(pacient.isAreAsigurare()){
            System.out.println("Pacientul "+pacient.getNume()+" a fost internat ptr ca are asigurare!");
            pacient.setEsteInternat(true);
        }
        else
            System.out.println("Pacientul "+pacient.getNume()+" NU a fost internat ptr ca NU are asigurare!");
    }
}
