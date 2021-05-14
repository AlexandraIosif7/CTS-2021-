package s2.Chain.main;

import s2.Chain.clase.*;

public class Main {
    public static void main(String[] args) {

        Client client1=new Client(20,2505,"Ion");
        Client client2=new Client(32,200,"Maria");
        Client client3=new Client(35,5500,"Ana");

        HandlerAbstract verificareVarsta= new VerificareVarsta();
        HandlerAbstract verificareSalariu=new VerificareSalariu();
        HandlerAbstract verificareFinala= new VerificareFinala();

        verificareVarsta.setSuccessor(verificareSalariu);
        verificareSalariu.setSuccessor(verificareFinala);

        verificareVarsta.acordaCredit(client1);
        verificareVarsta.acordaCredit(client2);
        verificareVarsta.acordaCredit(client3);
    }
}
