package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Regina {

    private int varsta;
    private String nume;
    private List<String> urmasi;

    private Regina() {
        this.varsta=90;
        this.nume="Elizabeth";
        this.urmasi=new ArrayList<String>(
                Arrays.asList("Charles",
                        "Anne","Edward",
                        "Andrew"));
    }

    private Regina(int varsta, String nume, List<String> urmasi) {
        this.varsta = varsta;
        this.nume = nume;
        this.urmasi = urmasi;
    }

    private static Regina instance=null;

    public static synchronized Regina getInstance(int varsta, String nume, List<String> urmasi){
        if(instance==null)
        {
            instance=new Regina(varsta,nume,urmasi);
        }
        return instance;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setUrmasi(List<String> urmasi) {
        this.urmasi = urmasi;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Regina{");
        sb.append("varsta=").append(varsta);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", urmasi=").append(urmasi);
        sb.append('}');
        return sb.toString();
    }
}
