package ChainOfResponsibility.clase;

//Handler concret 2
public class NotificatorEmail extends Notificator {
    @Override
    public void trimiteNotificare(Client client, String text) {

        if(client.getEmail()!=null){
            System.out.println("Trimitere notificare prin email catre clientul "+client.getNume()+" "+text);
        }
        //ft importanta aceasta conditie!!!!!
        else if(super.getNotificator()!=null){
            super.getNotificator().trimiteNotificare(client,text);
        }
        else
        {
            //aici am facut asa ca sa inlocuim managerul si sa nu mai facem inca un handler concret
            System.out.println("Nu avem datele de contact necesare!");
        }
    }
}
