package s2.Chain.clase;

public class VerificareVarsta extends HandlerAbstract {
    @Override
    public void acordaCredit(Client client) {
        if (client.getVarsta() < 21|| client.getVarsta() >= 60) {
            System.out.println("Clientul " + client.getNume() + " nu are varsta necesara ptr a primi un credit");
            System.out.println("Datele au fost salvate in sistem");
        }
        else if(super.getSuccessor()!=null){
            super.getSuccessor().acordaCredit(client);
        }
    }
}
