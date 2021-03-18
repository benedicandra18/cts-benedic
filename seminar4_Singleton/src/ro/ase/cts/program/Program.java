package ro.ase.cts.program;

import ro.ase.cts.clase.ManagerSpital;
import ro.ase.cts.clase.ManagerSpitalLazy;
import ro.ase.cts.clase.exercitiu.Abdomen;

public class Program {

	public static void main(String[] args) {
		ManagerSpital m1=ManagerSpital.getInstance();
		ManagerSpital m2=ManagerSpital.getInstance();
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		
		//aceeasi instanta
		ManagerSpitalLazy ml=ManagerSpitalLazy.getInstance("lili",40,1200);
		ManagerSpitalLazy ml2=ManagerSpitalLazy.getInstance("lala",50,1200);
		
		ml.setVarsta(10);
		ml2.setNume("vali");
		
		System.out.println(ml.toString());
		System.out.println(ml2.toString());
		
		Abdomen a1=Abdomen.getInstance(8, 1, 10);
		Abdomen a2=Abdomen.getInstance(6, 1, 9);
		
		a1.setNrPatratele(1);
		a2.setGreutate((double)1.3);
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
	}

}
