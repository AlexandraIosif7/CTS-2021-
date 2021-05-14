package s1.Singleton.clase;

public class BarieraAutomata implements IBariera {
    private boolean esteRidicata;
    private boolean esteCoborata;

    private BarieraAutomata() {
        this.esteCoborata=true;
        this.esteRidicata=false;
    }
    private static BarieraAutomata instance = null;

    public static synchronized BarieraAutomata getBariera(){
        if(instance==null){
            instance=new BarieraAutomata();
        }
        return instance;
    }

    @Override
    public void ridica() {
        if(esteCoborata){
            System.out.println("S-a ridicat bariera");
            esteRidicata=true;
            esteCoborata=false;
        }
        else{
            System.out.println("Bariera este deja ridicata");
        }
    }

    @Override
    public void coboara() {
        if(esteRidicata){
            System.out.println("S-a coborat bariera");
            esteRidicata=false;
            esteCoborata=true;
        }
        else{
            System.out.println("Bariera este deja coborata");
        }
    }

}
