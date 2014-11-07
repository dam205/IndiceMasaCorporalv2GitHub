package com.example.indicedemasacorporal;

public class IndiceMasaCorporalPesoException extends
		IndiceMasaCorporalException {

	/**
	 * 
	 */
	public IndiceMasaCorporalPesoException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param detailMessage
	 */
	public IndiceMasaCorporalPesoException(String detailMessage) {
		super(detailMessage);
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 */
	public String getMessage() {
		// TODO Auto-generated method stub
		//return super.getMessage();
		return "Valor de peso incorrecto";
	}

}
