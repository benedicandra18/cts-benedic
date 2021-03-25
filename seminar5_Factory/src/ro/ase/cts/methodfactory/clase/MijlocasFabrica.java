package ro.ase.cts.methodfactory.clase;

public class MijlocasFabrica implements JucatorFabrica{

	@Override
	public Jucator createJucator(String nume) {
		// TODO Auto-generated method stub
		return new Mijlocas(nume);
	}

}
