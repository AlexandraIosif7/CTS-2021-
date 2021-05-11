package State.main;

import State.clase.Masa;
import State.clase.StareLibera;

//B - 13
public class Main {

    public static void main(String[] args) {

        Masa masa1= new Masa(7);
        masa1.elibereazaMasa();

        masa1.rezervaMasa();
        //masa1.setStare(new StareLibera());
        masa1.rezervaMasa();
        masa1.ocupaMasa();

        masa1.elibereazaMasa();

    }
}
