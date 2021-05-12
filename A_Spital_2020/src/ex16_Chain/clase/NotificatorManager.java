package ex16_Chain.clase;

public class NotificatorManager extends NotificatorAbstract {
    @Override
    public void notifica(Pacient pacient, String mesaj) {
        System.out.println("Domnule Manager, agentia nu detine date de contact pentru pacientul: " + pacient.getName());
    }
}
