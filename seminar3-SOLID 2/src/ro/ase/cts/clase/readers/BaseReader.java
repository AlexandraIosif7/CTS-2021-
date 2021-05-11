package ro.ase.cts.clase.readers;

import ro.ase.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class BaseReader {

    protected String filePath;  // nu private ptr ca ne trebuie la mostenire

    public BaseReader(String filePath) {
        this.filePath = filePath;
    }

    public abstract List<Aplicant> readAplicants () throws FileNotFoundException, NumberFormatException;

    public void readOneAplicant(Scanner input, Aplicant aplicant){

        String nume = input.next();
        String prenume = input.next();
        int varsta = input.nextInt();
        int punctaj = input.nextInt();
        int nrProiecte = input.nextInt();
        String[] vectorDenumiri = new String[nrProiecte];
        for (int i = 0; i < nrProiecte; i++)
            vectorDenumiri[i] = input.next();

        aplicant.setNume(nume);
        aplicant.setVectorProiecteAnterioare(nrProiecte,vectorDenumiri);
        aplicant.setPrenume(prenume);
        aplicant.setPunctaj(punctaj);
        aplicant.setVarsta(varsta);
    }

}
