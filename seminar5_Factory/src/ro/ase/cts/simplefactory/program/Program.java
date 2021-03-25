package ro.ase.cts.simplefactory.program;

import ro.ase.cts.simplefactory.clase.FabricaJucatori;
import ro.ase.cts.simplefactory.clase.Jucator;
import ro.ase.cts.simplefactory.clase.TipJucator;

public class Program {

	public static void main(String[] args) {
		
		try {
			//FabricaJucatori fabrica=new FabricaJucatori();
			Jucator j1=FabricaJucatori.createJucator(TipJucator.Portar, "Dukadam");
			Jucator j2=FabricaJucatori.createJucator(TipJucator.Fundas, "Dumitrescu");
			
			System.out.println(j1.toString());
			System.out.println(j2.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
