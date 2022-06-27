package app.core.exceptions;

public class DaniException extends Exception{

	private static final long serialVersionUID = 1L;

	public DaniException() {
		super();
	}

	public DaniException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public DaniException(String message, Throwable cause) {
		super(message, cause);
	}

	public DaniException(String message) {
		super(message);
	}

	public DaniException(Throwable cause) {
		super(cause);
	}
	
	 
}
