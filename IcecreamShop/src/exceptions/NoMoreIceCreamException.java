package exceptions;

import eatables.Eatable;

public class NoMoreIceCreamException implements Eatable{
	public NoMoreIceCreamException() {}
	
	@Override
	public void eat() {
		System.out.println("You ordered: 1 x NoMoreIceCreamException.");
	}
}
