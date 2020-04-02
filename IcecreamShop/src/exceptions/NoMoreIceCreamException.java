package exceptions;

public class NoMoreIceCreamException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoMoreIceCreamException() {
		super();
	}
	
	public NoMoreIceCreamException(String message) {
		super(message);
	}
	
	public NoMoreIceCreamException(String message, Throwable couse){
		super(message, couse);
	}
	
	public NoMoreIceCreamException(Throwable couse){
		super(couse);
	}
}
