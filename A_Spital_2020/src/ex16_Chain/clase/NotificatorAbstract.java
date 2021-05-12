package ex16_Chain.clase;

public abstract class NotificatorAbstract {
    private NotificatorAbstract succesor;

    public void setSuccesor(NotificatorAbstract succesor) {
        this.succesor = succesor;
    }

    public NotificatorAbstract getSuccesor() {
        return succesor;
    }

    public abstract void notifica(Pacient pacient, String mesaj);
}
