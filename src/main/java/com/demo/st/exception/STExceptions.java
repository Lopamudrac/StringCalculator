package com.demo.st.exception;

public class STExceptions extends Exception {


	private static final long serialVersionUID = 1L;

	public STExceptions() {
		super();
	}

	public STExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public STExceptions(String message, Throwable cause) {
		super(message, cause);
	}

	public STExceptions(String message) {
		super(message);
	}

	public STExceptions(Throwable cause) {
		super(cause);
	}
	

}
