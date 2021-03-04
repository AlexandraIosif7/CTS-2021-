package ro.ase.cts.clase.readers;

import ro.ase.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;

public interface IReader {

    public List<Aplicant> readAplicants (String file) throws FileNotFoundException, NumberFormatException;
}
