package Command.clase;

//EXECUTANT
public class Masa {

    private int nrMasa;
    private Boolean esteOcupata;
    private Boolean esteRezervata;

    public Masa(int nrMasa) {
        this.nrMasa=nrMasa;
        this.esteRezervata=false;
        this.esteOcupata=false;
    }

    public void ocupaMasa(){

        if(!this.esteOcupata){
            this.esteOcupata=true;
            System.out.println("Masa este libera si am ocupat-o");
        }
        else{
            System.out.println("Masa este deja ocupata");
        }
    }

    public void rezervaMasa(){

        if(!this.esteRezervata){
            this.esteRezervata=true;
            System.out.println("Masa este libera si am rezervat-o");
        }
        else{
            System.out.println("Masa este deja rezervata");
        }
    }

}
