package eatables;

import sorten.Flavor;

public class Cone implements Eatable {
	private Flavor[] balls;
	
	public Cone() {}
	
	public Cone(Flavor[] balls) {
		this.balls=balls;
	}
	
	public void eat(){
		System.out.print("You ordered "+balls.length+" type(s): ");
		for (Flavor bal: this.balls) {
			System.out.print(bal.name().substring(0,1).concat(bal.name().substring(1).toLowerCase())+", ");
		}
		System.out.println();
	}
}
