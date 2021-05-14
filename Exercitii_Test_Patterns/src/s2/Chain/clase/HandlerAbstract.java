package s2.Chain.clase;

public abstract class HandlerAbstract {
    private HandlerAbstract successor;

    public HandlerAbstract getSuccessor() {
        return successor;
    }

    public void setSuccessor(HandlerAbstract successor) {
        this.successor = successor;
    }

    public abstract void acordaCredit(Client client);
}
