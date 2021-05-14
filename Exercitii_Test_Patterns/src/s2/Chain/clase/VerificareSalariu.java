package s2.Chain.clase;

public class VerificareSalariu extends HandlerAbstract {
    @Override
    public void acordaCredit(Client client) {
        if (client.getSalariu() < 2500 ) {
            System.out.println("Clientul "+client.getNume()+" nu are salariul suficient de mic ptr a primi un credit");
            System.out.println("Datele au fost salvate in sistem");
        }
        else if(super.getSuccessor()!=null){
            super.getSuccessor().acordaCredit(client);
        }
    }
}
