package ro.ase.cts.clase.readers;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentsReader extends BaseReader {


    public StudentsReader(String filePath) {
        super(filePath);
    }

    public List<Aplicant> readAplicants() throws FileNotFoundException, NumberFormatException {
        Scanner continutFisier = new Scanner(new File(super.filePath));
        continutFisier.useDelimiter(",");
        List<Aplicant> studenti = new ArrayList<>();

        while (continutFisier.hasNext()) {
            Student student=new Student();
            super.readOneAplicant(continutFisier,student);

            int aniStudii = continutFisier.nextInt();
            String facultate = continutFisier.next();
            student.setAnStudii(aniStudii);
            student.setFacultate(facultate);

            studenti.add(student);
        }
        continutFisier.close();
        return studenti;
    }
}
