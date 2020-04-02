import eatables.*;
import exceptions.NoMoreIceCreamException;
import sellers.*;
import sorten.*;

public class IcecreamShopApp1 {

	public static void main(String[] args) throws NoMoreIceCreamException {
		Flavor[] flavor = { Flavor.MOKKA, Flavor.CHOCOLATE, Flavor.LEMON, Flavor.STRAWBERRY };
		
		MagnumType magnumType = MagnumType.ALPINENUTS;
		MagnumType magnumType1 = MagnumType.ROMANTICSTRAWBERRIES;

		double ballPrice=2;
		double rocketPrice=2.5;
		double magnumStandardPrice=1.5;
		Pricelist pricelist = new Pricelist(ballPrice, rocketPrice, magnumStandardPrice);

		IceCreamSeller iceCreamSalon = new IceCreamSalon(pricelist);

		Eatable[] eatables = new Eatable[4];

		eatables[0] = iceCreamSalon.orderCone(flavor);
		eatables[1] = iceCreamSalon.orderIceRocket();
		eatables[2] = iceCreamSalon.orderMagnum(magnumType);
		eatables[3] = iceCreamSalon.orderMagnum(magnumType1);
		

		for (Eatable eatable : eatables) {
			eatable.eat();
		}

		System.out.println(iceCreamSalon);

	}

}
