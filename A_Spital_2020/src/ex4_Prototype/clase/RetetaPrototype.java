package ex4_Prototype.clase;

public class RetetaPrototype implements IRetetaPrototype {

    private int substanta1;
    private int substanta2;
    private int substanta3;

    private RetetaPrototype(){
        substanta1=0;
        substanta2=0;
        substanta3=0;
    }

    public RetetaPrototype(int substanta1, int substanta2, int substanta3){
        if(!(substanta1<0) && !(substanta2<0) && !(substanta3<0)){
            this.substanta1=substanta1;
            this.substanta3=substanta2;
            this.substanta3=substanta3;
        }
        else {
            this.substanta1=0;
            this.substanta2=0;
            this.substanta3=0;
        }
    }

    @Override
    public IRetetaPrototype copiaza() {
        RetetaPrototype copie= new RetetaPrototype();

        copie.substanta1=this.substanta1;
        copie.substanta2=this.substanta2;
        copie.substanta3=this.substanta3;

        return copie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RetetaPrototype{");
        sb.append("substanta1=").append(substanta1);
        sb.append(", substanta2=").append(substanta2);
        sb.append(", substanta3=").append(substanta3);
        sb.append('}');
        return sb.toString();
    }
}
