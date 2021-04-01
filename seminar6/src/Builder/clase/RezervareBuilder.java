package Builder.clase;

// builder in care obiectul se initializeaza in constructor = trebuie sa facem cate un obiect d-asta ptr fiecare obiect Rezervare diferit pe care il vreau, adica el face shallow copy, nu deep copy
public class RezervareBuilder implements AbstractBuilder{

    private Rezervare rezervare;

    public RezervareBuilder(){
        this.rezervare=new Rezervare(0,false,false,false,false,"no");
    }

    public RezervareBuilder(int cod){
        this.rezervare=new Rezervare(cod,false,false,true,true,"jazz");
    }

    //la builder avem tipul returnat egal cu tipul builderului, nu cu void, ptr a putea apela in cascada
    public RezervareBuilder setAreMancare(boolean areMancare){
        rezervare.setAreMancare(areMancare);
        return this;
    }
    public RezervareBuilder setAreScaun(boolean areScaun){
        rezervare.setAreScaunErgonomic(areScaun);
        return this;
    }
    public RezervareBuilder setAreBautura(boolean areBautura){
        rezervare.setAreBautura(areBautura);
        return this;
    }
    public RezervareBuilder setAreMuzicaPersonalizata(boolean areMuzica){
        rezervare.setAreMuzicaPersonalizata(areMuzica);
        return this;
    }
    public RezervareBuilder setGenMuzica(String gen){
        rezervare.setGenMuzica(gen);
        return this;
    }
    public RezervareBuilder setCodRezervare(int cod){
        rezervare.setCodRezervare(cod);
        return this;
    }

    @Override
    public Rezervare build() {
        return this.rezervare;
    }
            }
