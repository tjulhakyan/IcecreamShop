package sorten;

public enum MagnumType {
	MILKCHOCOLATE(1), WHITECHOCOLATE(1), BLACKCHOCOLATE(1.2), ALPINENUTS(1.5), ROMANTICSTRAWBERRIES(2);
	
	double price;
	
	private MagnumType(double price) {
		this.price=price;
	}
	
	public double getPrice() {
		return price;
	}
}
