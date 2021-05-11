package ChainOfResponsibility.clase;
//Handler abstract
//clasa abstracta ptr ca trebuie s aavem relatie de has a cu sine insusi
public abstract class Notificator {

    private Notificator notificator;

    //obligattoriu setter ptr succesor
    public void setNotificator(Notificator notificator) {
        this.notificator = notificator;
    }

    //getter ptr a putea chema in clasele concrete
    public Notificator getNotificator() {
        return notificator;
    }

    public abstract void trimiteNotificare(Client client, String text);
}
