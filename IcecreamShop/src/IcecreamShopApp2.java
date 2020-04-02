import eatables.*;
import exceptions.NoMoreIceCreamException;
import sellers.*;
import sorten.Flavor;
import sorten.MagnumType;

public class IcecreamShopApp2 {

	public static void main(String[] args) throws NoMoreIceCreamException {
		Flavor[] flavor = { Flavor.MOKKA, Flavor.CHOCOLATE, Flavor.LEMON, Flavor.STRAWBERRY };

		MagnumType magnumType = MagnumType.ALPINENUTS;
		MagnumType magnumType1 = MagnumType.ROMANTICSTRAWBERRIES;

		double ballPrice = 2;
		double rocketPrice = 2.5;
		double magnumStandardPrice = 1.5;
		Pricelist pricelist = new Pricelist(ballPrice, rocketPrice, magnumStandardPrice);

		
		int iceRockets=10;
		int cones=3;
		int balls=20;
		int magni=5;
		Stock stock=new Stock(iceRockets, cones, balls, magni);
		IceCreamSeller iceCreamCar = new IceCreamCar(stock, pricelist);

		Eatable[] eatables = new Eatable[4];

		
		eatables[0] = iceCreamCar.orderCone(flavor);
		eatables[1] = iceCreamCar.orderIceRocket();
		eatables[2] = iceCreamCar.orderMagnum(magnumType);
		eatables[3] = iceCreamCar.orderMagnum(magnumType1);


		for (Eatable eatable : eatables) {
			eatable.eat();
		}

		System.out.println(iceCreamCar.getProfit()+" €");
	}

}
