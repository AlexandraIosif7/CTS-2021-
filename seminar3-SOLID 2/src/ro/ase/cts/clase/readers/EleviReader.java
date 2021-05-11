package ro.ase.cts.clase.readers;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EleviReader extends BaseReader {


    public EleviReader(String filePath) {
        super(filePath);
    }

    public List<Aplicant> readAplicants() throws FileNotFoundException, NumberFormatException {
        Scanner continutFisier = new Scanner(new File(super.filePath));
        continutFisier.useDelimiter(",");
        List<Aplicant> elevi = new ArrayList<>();

        while (continutFisier.hasNext()) {
            Elev elev= new Elev();
            super.readOneAplicant(continutFisier,elev);

            int clasa = continutFisier.nextInt();
            String tutore = continutFisier.next();
            elev.setClasa(clasa);
            elev.setTutore(tutore);

            elevi.add(elev);
        }

        continutFisier.close();
        return elevi;
    }
}
