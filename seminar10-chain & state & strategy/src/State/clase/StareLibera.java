package State.clase;
//State concret A

//facem modificarile in starile concrete ptr ca avem niste avantaje. Am putea sa facem validarile in metodele specifice din Masa
//cica daca trebuia sa facem distinctia dintr rezervata si libera inainte de ocupare nu mai facem validarile aici ci in Masa, dar nu prea am inteles
public class StareLibera implements Stare {
    @Override
    public void modificaStare(Masa masa) {
        if(masa.getStare() instanceof StareLibera ){
            System.out.println("Nu putem face aceasta modificare!");
        }
        else{
            masa.setStare(this);
            System.out.println("Masa cu nr "+ masa.getNumar() +" a fost elibarata.");
        }
    }
}
