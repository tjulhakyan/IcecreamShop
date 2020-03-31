import eatables.*;
import exceptions.Stock;
import sellers.*;
import sorten.Flavor;
import sorten.MagnumType;

public class IcecreamShopApp2 {

	public static void main(String[] args) {
		Flavor[] flavor = { Flavor.MOKKA, Flavor.CHOCOLATE, Flavor.LEMON, Flavor.STRAWBERRY };

		MagnumType magnumType = MagnumType.ALPINENUTS;
		MagnumType magnumType1 = MagnumType.ROMANTICSTRAWBERRIES;

		double ballPrice = 2;
		double rocketPrice = 2.5;
		double magnumStandardPrice = 1.5;
		Pricelist pricelist = new Pricelist(ballPrice, rocketPrice, magnumStandardPrice);

		
		int iceRockets=5;
		int cones=2;
		int balls=20;
		int magni=1;
		Stock stock=new Stock(iceRockets, cones, balls, magni);
		IceCreamSeller iceCreamCar = new IceCreamCar(stock, pricelist);

		Eatable[] eatables = new Eatable[4];

		eatables[0] = iceCreamCar.orderCone(flavor);
		eatables[1] = iceCreamCar.orderIceRocket();
		if(eatables[1]==null) {
			eatables[1] = iceCreamCar.orderNoMoreIceCreamException();
		}
		
		eatables[2] = iceCreamCar.orderMagnum(magnumType);
		if(eatables[2]==null) {
			eatables[2] = iceCreamCar.orderNoMoreIceCreamException();
		}
		
		eatables[3] = iceCreamCar.orderMagnum(magnumType1);
		if(eatables[3]==null) {
			eatables[3] = iceCreamCar.orderNoMoreIceCreamException();
		}
		

		for (Eatable eatable : eatables) {
			eatable.eat();
		}

		System.out.println(iceCreamCar.getProfit()+" €");
	}

}
