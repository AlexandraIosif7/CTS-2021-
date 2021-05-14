package Observer.clase;

//observabil concret - cel care trimite notificari
public class Manager extends ManagerSalaDeSport {

    public void anuntaMeci(String tipDeMeci){
        super.notificaObservatori("Va avea loc un meci de "+tipDeMeci);
    }


}
