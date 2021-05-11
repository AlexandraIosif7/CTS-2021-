package Strategy.clase;

public class PlataCard implements IPlata {

    //putem sa adaugam un atribut un sold si sa verificam inainte de plata daca avem suficient sold, optional
    @Override
    public void plateste(float suma) {
        System.out.println("A fost realizata plata cu cardul pentru suma "+suma);
    }
}
