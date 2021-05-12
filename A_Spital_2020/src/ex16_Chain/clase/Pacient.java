package ex16_Chain.clase;

import ex8_Composite.clase.Sectie;

public class Pacient {
    private String name;
    private String nrtel;
    private String email;

    public Pacient(String name, String nrtel, String email) {
        this.name = name;
        this.nrtel = nrtel;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNrtel() {
        return nrtel;
    }

    public void setNrtel(String nrtel) {
        this.nrtel = nrtel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
