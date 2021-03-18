package ro.ase.cts.clase;

public class ManagerSpitalThreadSafe {
	
	private String nume;
	private int varsta;
	private int marca;
	
	private static ManagerSpitalThreadSafe instanta=null;
	
	public synchronized static ManagerSpitalThreadSafe getInstance(String nume, int varsta, int marca) {
		if(instanta==null) {
			instanta=new ManagerSpitalThreadSafe(nume, varsta, marca);
		}
		return instanta;
	}
	
	private ManagerSpitalThreadSafe(String nume, int varsta, int marca) {
		super();
		this.nume = nume;
		this.varsta = varsta;
		this.marca = marca;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public void setMarca(int marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "ManagerSpitalThreadsafe [nume=" + nume + ", varsta=" + varsta + ", marca=" + marca + "]";
	}
	

}
