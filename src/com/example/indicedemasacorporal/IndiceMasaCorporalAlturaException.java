package com.example.indicedemasacorporal;

public class IndiceMasaCorporalAlturaException extends
		IndiceMasaCorporalException {

	/**
	 * 
	 */
	public IndiceMasaCorporalAlturaException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param detailMessage
	 */
	public IndiceMasaCorporalAlturaException(String detailMessage) {
		super(detailMessage);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Throwable#getMessage()
	 */
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		//return super.getMessage();
		return "Valor de altura incorrecto";
	}

	
}
