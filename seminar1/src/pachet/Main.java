package pachet;

import clase.Giraffe;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zoo zoo = new Zoo();
		Giraffe g1=new Giraffe("ela",100);
		Giraffe g2=new Giraffe("bela");
		
		zoo.addAnimal(g1);
		zoo.addAnimal(g2);
		zoo.feedAllAnimals();
		
	}

}
