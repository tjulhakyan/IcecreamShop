package sellers;

import eatables.*;
import exceptions.NoMoreIceCreamException;
import sorten.Flavor;
import sorten.MagnumType;

public interface IceCreamSeller extends Profitable{
	
	Cone orderCone(Flavor[] flavor);
	
	IceRocket orderIceRocket() throws NoMoreIceCreamException;
	
	Magnum orderMagnum(MagnumType magnumType) throws NoMoreIceCreamException;

}
