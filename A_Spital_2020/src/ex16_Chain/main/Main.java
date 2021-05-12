package ex16_Chain.main;

import ex16_Chain.clase.NotificatorEmail;
import ex16_Chain.clase.NotificatorManager;
import ex16_Chain.clase.NotificatorSMS;
import ex16_Chain.clase.Pacient;

public class Main {
    public static void main(String[] args) {

        NotificatorSMS notificatorSMS= new NotificatorSMS();
        NotificatorEmail notificatorEmail=new NotificatorEmail();
        NotificatorManager notificatorManager=new NotificatorManager();

        notificatorSMS.setSuccesor(notificatorEmail);
        notificatorEmail.setSuccesor(notificatorManager);

        Pacient pacient = new Pacient("Marian",null,null);
        notificatorSMS.notifica(pacient,"mesaj");
    }
}
