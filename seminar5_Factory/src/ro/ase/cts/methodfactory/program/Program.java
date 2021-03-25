package ro.ase.cts.methodfactory.program;
import ro.ase.cts.methodfactory.clase.AtacantFabrica;
import ro.ase.cts.methodfactory.clase.Jucator;
import ro.ase.cts.methodfactory.clase.JucatorFabrica;
import ro.ase.cts.methodfactory.clase.MijlocasFabrica;
import ro.ase.cts.methodfactory.clase.PortarFabrica;

public class Program {
	
	public static void printeazaJucatori(JucatorFabrica jucatorFabrica, String nume) {
		Jucator jucator=jucatorFabrica.createJucator(nume);
		System.out.println(jucator.toString());
	}

	public static void main(String[] args) {
		printeazaJucatori(new PortarFabrica(),"dukadam");
		printeazaJucatori(new AtacantFabrica(),"messi");
		printeazaJucatori(new MijlocasFabrica(),"ronaldo");
	}

}
