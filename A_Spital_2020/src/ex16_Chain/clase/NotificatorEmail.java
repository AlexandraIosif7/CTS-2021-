package ex16_Chain.clase;

public class NotificatorEmail extends NotificatorAbstract {
    @Override
    public void notifica(Pacient pacient, String mesaj) {

        if(pacient.getEmail()!=null){
            System.out.println("Trimitere notificare ptr email "+pacient.getName()+" "+mesaj);
        }
        else if(super.getSuccesor()!=null){
            super.getSuccesor().notifica(pacient,mesaj);
        }
    }
}
