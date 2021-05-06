package ChainOfResponsibility.clase;

//Handler concret 1
public class NotificatorSMS extends Notificator {
    @Override
    public void trimiteNotificare(Client client, String text) {

        if(client.getNrTelefon()!=null){
            System.out.println("Trimitere notificare prin SMS catre clientul "+client.getNume()+" "+text);
        }
        //ft importanta aceasta conditie!!!!!
        else if(super.getNotificator()!=null){
            super.getNotificator().trimiteNotificare(client,text);
        }
        else
        {   //aici am facut asa ca sa inlocuim managerul si sa nu mai facem inca un handler concret
            System.out.println("Nu avem datele de contact necesare!");
        }
    }
}
