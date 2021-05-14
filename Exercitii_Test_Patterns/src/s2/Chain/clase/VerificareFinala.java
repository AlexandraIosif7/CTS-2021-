package s2.Chain.clase;

public class VerificareFinala extends HandlerAbstract {
    @Override
    public void acordaCredit(Client client) {
        System.out.println("Creditul a fost acordat clientului "+client.getNume());
        System.out.println("Datele au fost salvate in sistem");
    }
}

