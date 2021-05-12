package ex16_Chain.clase;

public class NotificatorSMS extends NotificatorAbstract {
    @Override
    public void notifica(Pacient pacient, String mesaj) {

        if(pacient.getNrtel()!=null){
            System.out.println("Trimitere notificare ptr sms "+pacient.getName()+" "+mesaj);
        }
        else if(super.getSuccesor()!=null){
            super.getSuccesor().notifica(pacient,mesaj);
        }
    }
}
