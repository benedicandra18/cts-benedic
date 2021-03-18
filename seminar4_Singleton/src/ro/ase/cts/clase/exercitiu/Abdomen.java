package ro.ase.cts.clase.exercitiu;

public class Abdomen {
	private int nrPatratele;
	private double greutate;
	private float nota;
	
	private static Abdomen instanta=null;
	
	public synchronized static Abdomen getInstance(int nrPatratele, double greutate, float nota) {
		if(instanta==null) {
			instanta=new Abdomen(nrPatratele,greutate, nota);
		}
		return instanta;
	}
	
	private Abdomen(int nrPatratele, double greutate, float nota) {
		super();
		this.nrPatratele = nrPatratele;
		this.greutate = greutate;
		this.nota = nota;
	}

	public void setNrPatratele(int nrPatratele) {
		this.nrPatratele = nrPatratele;
	}

	public void setGreutate(double greutate) {
		this.greutate = greutate;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Abdomen [nrPatratele=" + nrPatratele + ", greutate=" + greutate + ", nota=" + nota + "]";
	}

}
