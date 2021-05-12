package ex11_Strategy.clase;

public class PlataCard implements IPlata {
    @Override
    public void plateste(int suma) {
        System.out.println("A fost realizata plata cu cardul in valoare de "+suma);
    }
}
