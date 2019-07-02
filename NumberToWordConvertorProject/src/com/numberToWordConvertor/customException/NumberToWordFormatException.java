package com.numberToWordConvertor.customException;

public class NumberToWordFormatException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int numberToConvert;
	public static final String CONST_MESSAGE = "Enter Valid Number Between 0 - 999999999";
	
	public NumberToWordFormatException(int numberToConvert){
		this.numberToConvert = numberToConvert;
	}
	
	public String toString() {
	      return (CONST_MESSAGE +"[" + numberToConvert + "]");
	   }
	
}
