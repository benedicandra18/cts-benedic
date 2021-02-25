package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	
	private List<Animal> animals;
	private Zookeeper zookeeper;
	
	public Zoo() {
		super();
		this.animals = new ArrayList<Animal>();
		this.zookeeper = new Zookeeper("gigi");
	}

	public Zoo(List<Animal> animals, Zookeeper zookeeper) {
		super();
		this.animals = animals;
		this.zookeeper = zookeeper;
	}
	
	
	
	public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}

	public Zookeeper getZookeeper() {
		return zookeeper;
	}

	public void setZookeeper(Zookeeper zookeeper) {
		this.zookeeper = zookeeper;
	}

	public void addAnimal(Animal a) {
		this.animals.add(a);
	}
	
	public void feedAllAnimals() {
		for(Animal a : this.animals) {
			this.zookeeper.feed(a);
		}
	}
	
	
	

}
