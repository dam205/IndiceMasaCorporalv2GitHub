package com.example.indicedemasacorporal;

public class IndiceMasaCorporalException extends Exception {

	boolean errorPeso = false;
	boolean errorAltura = false;
	
     public IndiceMasaCorporalException() {
		// TODO Auto-generated constructor stub
	}
     
     public IndiceMasaCorporalException(String msg) {
 		// TODO Auto-generated constructor stub
 	}

	/**
	 * 
	 */
	public IndiceMasaCorporalException(boolean errorPeso, boolean errorAltura) {
		super();
		// TODO Auto-generated constructor stub
		this.errorPeso = errorPeso;
		this.errorAltura = errorAltura;		
	}

	/**
	 * @return the errorPeso
	 */
	public boolean isErrorPeso() {
		return errorPeso;
	}

	/**
	 * @return the errorAltura
	 */
	public boolean isErrorAltura() {
		return errorAltura;
	}



}
