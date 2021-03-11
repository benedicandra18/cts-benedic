package ro.ase.cts.clase;


import java.io.FileNotFoundException;
import java.util.List;


import ro.ase.cts.clase.readers.Reader;

//pt interfatarea celor 3 clase reader
//e o interfata pt a ajunge la clasele concrete reader
public class UniversalReader {
	//TO DO
	//fol ca punct de legatura catre readere

	public static List<Aplicant> readAplicants(Reader reader) throws FileNotFoundException{
		return reader.readAplicants();
	}
}
