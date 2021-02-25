package pachet;

import clase.Giraffe;
import clase.Zebra;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zoo zoo = new Zoo();
		Giraffe g1=new Giraffe("ela",100);
		Giraffe g2=new Giraffe("bela");
		Zebra z1=new Zebra("zizi");
		
		zoo.addAnimal(g1);
		zoo.addAnimal(g2);
		zoo.addAnimal(z1);
		zoo.feedAllAnimals();
		
	}

}
