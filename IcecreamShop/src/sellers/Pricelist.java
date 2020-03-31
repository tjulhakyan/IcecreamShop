package sellers;

import sorten.MagnumType;

public class Pricelist {
	private double ballPrice;
	private double rocketPrice;
	private double magnumStandardPrice;
	
	public Pricelist(){}
	
	public Pricelist(double ballPrice, double rocketPrice, double magnumStandardPrice){
		this.ballPrice=ballPrice;
		this.rocketPrice=rocketPrice;
		this.magnumStandardPrice=magnumStandardPrice;
	}

	public double getBallPrice() {
		return ballPrice;
	}

	public void setBallPrice(double ballPrice) {
		this.ballPrice = ballPrice;
	}

	public double getRocketPrice() {
		return this.rocketPrice;
	}

	public void setRocketPrice(double rocketPrice) {
		this.rocketPrice = rocketPrice;
	}

	public double getMagnumPrice(MagnumType magnumType) {
		return this.magnumStandardPrice * magnumType.getPrice();
	}

	public void setMagnumStandardPrice(double magnumStandardPrice) {
		this.magnumStandardPrice = magnumStandardPrice;
	} 
	
}
