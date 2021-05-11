package ro.ase.cts.clase.readers;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader extends BaseReader {


    public AngajatiReader(String filePath) {
        super(filePath);
    }


    public List<Aplicant> readAplicants() throws FileNotFoundException, NumberFormatException {
        Scanner continutFisier = new Scanner(new File(super.filePath));
        continutFisier.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<>();

        while (continutFisier.hasNext()) {
            Angajat angajat=new Angajat();
            super.readOneAplicant(continutFisier,angajat);

            int salariu = continutFisier.nextInt();
            String ocupatie = continutFisier.next();
            angajat.setSalariu(salariu);
            angajat.setOcupatie(ocupatie);

            angajati.add(angajat);
        }
        continutFisier.close();
        return angajati;
    }
}
