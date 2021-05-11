package ChainOfResponsibility.main;

import ChainOfResponsibility.clase.Client;
import ChainOfResponsibility.clase.Notificator;
import ChainOfResponsibility.clase.NotificatorEmail;
import ChainOfResponsibility.clase.NotificatorSMS;

//B - 16
public class Main {
    public static void main(String[] args) {

        Client client1= new Client("Maria","0730245987","maria@yahoo.com");
        Client client2= new Client("Ion","0754698712",null);
        Client client3= new Client("Vasile",null,null);
        Client client4= new Client("Gheorghe",null,"gheorghe@yahoo.com");


        NotificatorSMS notificatorSMS= new NotificatorSMS();
        NotificatorEmail notificatorEmail= new NotificatorEmail();

        notificatorSMS.setNotificator(notificatorEmail);

        notificatorSMS.trimiteNotificare(client1,"Mesaj1");
        notificatorSMS.trimiteNotificare(client2,"Mesaj2");
        notificatorSMS.trimiteNotificare(client4,"Mesaj4");
        notificatorSMS.trimiteNotificare(client3,"Mesaj3");



    }
}
