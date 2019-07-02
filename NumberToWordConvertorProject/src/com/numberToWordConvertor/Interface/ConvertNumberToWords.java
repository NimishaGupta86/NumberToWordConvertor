package com.numberToWordConvertor.Interface;

import com.numberToWordConvertor.customException.NumberToWordFormatException;

public interface ConvertNumberToWords {
	public String convertLessThanThousand(int number) throws NumberToWordFormatException;
	public String convertAnyNumberToWords(int number) throws NumberToWordFormatException;
	
}
