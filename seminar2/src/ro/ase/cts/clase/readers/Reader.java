package ro.ase.cts.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;
import ro.ase.cts.clase.Aplicant;

//o folosim pt a fi mostenita in cele 3 readere
//pt abstractizarea celor 3 clase
public abstract class Reader {
	
	protected String filename;
	
	public Reader(String filename) {
		this.filename=filename;
	}
	



	//nu o implementam aici pt ca e abstracta
	public abstract List<Aplicant> readAplicants() throws FileNotFoundException;

}
