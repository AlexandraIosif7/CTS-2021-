package ex5_Adapter.clase;
//clasa la care se face adaptarea
public class MedicamentFarmacie implements IMedicament{

    private String name;

    public MedicamentFarmacie(String name) {
        this.name = name;
    }

    @Override
    public void cumparaMedicament(){
        System.out.println("A fost achizitionat medicamentul "+name+" fara reteta");
    }
}
