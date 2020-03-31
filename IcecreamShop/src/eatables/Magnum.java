package eatables;

import sorten.MagnumType;

public class Magnum implements Eatable{
	private MagnumType type;
	
	public Magnum(){}
	
	public Magnum(MagnumType magnumType){
		this.type=magnumType;
	}
	
	public void eat(){
		System.out.print("You ordered: 1 x ");
		System.out.println(type.name().substring(0,1).concat(type.name().substring(1).toLowerCase())+", ");
	}
	
	public MagnumType getType() {
		return this.type;
	}
}
