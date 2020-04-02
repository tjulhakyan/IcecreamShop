package sellers;

import eatables.*;
import sorten.Flavor;
import sorten.MagnumType;

public class IceCreamSalon implements IceCreamSeller {

	private Pricelist pricelist;
	private double totalProfit;
	
	public IceCreamSalon(Pricelist pricelist){
		this.pricelist=pricelist;
		this.totalProfit=0;
	}
	
	public double getProfit() {
		return this.totalProfit;
	}
	
	public Cone orderCone(Flavor[] flavor) {
		Cone cone = new Cone(flavor);
		this.totalProfit+=flavor.length*pricelist.getBallPrice();
		return cone;
	}
	
	public IceRocket orderIceRocket() {
		IceRocket iceRocket=new IceRocket();
		this.totalProfit+=pricelist.getRocketPrice();
		return iceRocket;
	}
	
	public Magnum orderMagnum(MagnumType magnumType) {
		Magnum magnum=new Magnum(magnumType);
		this.totalProfit+=pricelist.getMagnumPrice(magnumType);
		return magnum;
	}
	
	public String toString(){
		return "Total profit is: "+this.totalProfit+"€";
	}

}
