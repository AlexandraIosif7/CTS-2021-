package s1.Builder.clase;

public class BarieraInteligenta {

    private boolean senzorDistanta;
    private boolean senzorCard;
    private boolean modulPlata;
    private boolean butonBlocare;

    public BarieraInteligenta(boolean senzorDistanta, boolean senzorCard, boolean modulPlata, boolean butonBlocare) {
        this.senzorDistanta = senzorDistanta;
        this.senzorCard = senzorCard;
        this.modulPlata = modulPlata;
        this.butonBlocare = butonBlocare;
    }

    protected void setSenzorDistanta(boolean senzorDistanta) {
        this.senzorDistanta = senzorDistanta;
    }

    protected void setSenzorCard(boolean senzorCard) {
        this.senzorCard = senzorCard;
    }

    protected void setModulPlata(boolean modulPlata) {
        this.modulPlata = modulPlata;
    }

    protected void setButonBlocare(boolean butonBlocare) {
        this.butonBlocare = butonBlocare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BarieraInteligenta{");
        sb.append("senzorDistanta=").append(senzorDistanta);
        sb.append(", senzorCard=").append(senzorCard);
        sb.append(", modulPlata=").append(modulPlata);
        sb.append(", butonBlocare=").append(butonBlocare);
        sb.append('}');
        return sb.toString();
    }
}
