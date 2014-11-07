package com.example.indicedemasacorporal;

import android.util.Log;
import android.widget.Toast;

public class IndiceMasaCorporal {

	/**
	 * 
	 */
	private Double peso;
	private Integer altura;

	private final static int MAX_PESO = 300;
	private final static int MIN_PESO = 10;
	private final static int MAX_ALTURA = 300; // cm
	private final static int MIN_ALTURA = 100; // cm

	/*public IndiceMasaCorporal(Double peso, Integer altura)
			throws IndiceMasaCorporalException {
		// super();
		boolean errorPeso = !IndiceMasaCorporal.validarPeso(peso);
		boolean errorAltura = !IndiceMasaCorporal.validarAltura(altura);
		if (errorPeso || errorAltura) {
			//Log.e("IMC_ERROR_EXCEPTION", "Error Contructor IndiceMasaCorporal");
			throw new IndiceMasaCorporalException(errorPeso, errorAltura);
		} else {
			this.peso = peso;
			this.altura = altura;
		}
	}*/

	/**
	 * Constructor
	 * 
	 * @param peso
	 * @param altura
	 */
	public IndiceMasaCorporal(String peso, String altura)
			throws IndiceMasaCorporalException {
		// super();
		boolean errorPeso = !IndiceMasaCorporal.validarPeso(peso);
		boolean errorAltura = !IndiceMasaCorporal.validarAltura(altura);
		if (errorPeso || errorAltura) {
			throw new IndiceMasaCorporalException(errorPeso, errorAltura);
		}
		this.peso = Double.valueOf(peso);
		this.altura = Integer.valueOf(altura);

	}

	/**
	 * @return the altura
	 */
	public Integer getAltura() {
		return altura;
	}

	/**
	 * @return the peso
	 */
	public Double getPeso() {
		return peso;
	}

	/**
	 * 
	 * @return
	 */
	public Double valorIndiceMasaCorporal() {
		double altura_mts = altura.doubleValue() / 100.0;
		double valorIMC = peso.doubleValue() / Math.pow(altura_mts, 2.0);
		double valorIMCRedondeado = (double) Math.round(valorIMC * 100) / 100;
		return valorIMCRedondeado;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "IndiceMasaCorporal [peso=" + peso + ", altura=" + altura + "]";
	}

	/**
	 * Verifica que un valor de peso no es nulo y estŽ en su rango ...
	 * 
	 * @param valor
	 * @return
	 */
	private static boolean validarPeso(Double valor) {
		boolean resultado;
		if (valor == null) {
			resultado = false;
		} else {
			resultado = (valor.doubleValue() >= MIN_PESO && valor.doubleValue() <= MAX_PESO);
		}
		return resultado;
	}

	private static boolean validarPeso(String valor) {
		Double peso;
		boolean resultado = true;
		try {
			peso = Double.valueOf(valor);
			resultado = IndiceMasaCorporal.validarPeso(peso);
		} catch (Exception e) {
			resultado = false;
		}
		return resultado;
	}

	/**
	 * 
	 * @param valor
	 * @return
	 */
	private static boolean validarAltura(Integer valor) {
		boolean resultado;
		if (valor == null) {
			resultado = false;
		} else {
			resultado = (valor.intValue() >= MIN_ALTURA && valor.intValue() <= MAX_ALTURA);
		}
		return resultado;
	}

	/**
	 * 
	 * @param valor
	 * @return
	 */
	private static boolean validarAltura(String valor) {
		Integer altura;
		boolean resultado = true;
		try {
			altura = Integer.valueOf(valor);
			resultado = IndiceMasaCorporal.validarAltura(altura);
		} catch (Exception e) {
			resultado = false;
		}
		return resultado;
	}

	/**
	 * 
	 * @return
	 */
	public String clasificacionOMS() {

		String resultado;
		double valor = this.valorIndiceMasaCorporal();
		if (valor < 16.0) {
			resultado = "Infrapeso. Delgadez severa";
		} else if (valor < 16.99) {
			resultado = "Infrapeso. Delgadez moderada";
		} else if (valor < 18.49) {
			resultado = "Infrapeso. Delgadez aceptable";
		} else if (valor < 24.99) {
			resultado = "Peso Normal";
		} else if (valor < 29.99) {
			resultado = "Sobrepeso";
		} else if (valor < 34.99) {
			resultado = "Obeso. Tipo I";
		} else if (valor < 40.00) {
			resultado = "Obeso. Tipo II";
		} else {
			resultado = "Obeso. Tipo III";
		}
		return resultado;
	}
}
