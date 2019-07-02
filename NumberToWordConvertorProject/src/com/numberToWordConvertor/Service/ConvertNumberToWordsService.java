package com.numberToWordConvertor.Service;

import com.numberToWordConvertor.Interface.ConvertNumberToWords;
import com.numberToWordConvertor.customException.NumberToWordFormatException;

public class ConvertNumberToWordsService implements ConvertNumberToWords{


	private static final String[] specialNames = {
		"",
		" thousand",
		" million",
		" billion",

	};

	private static final String[] numNames = {
		"",
		" one",
		" two",
		" three",
		" four",
		" five",
		" six",
		" seven",
		" eight",
		" nine",
		" ten",
		" eleven",
		" twelve",
		" thirteen",
		" fourteen",
		" fifteen",
		" sixteen",
		" seventeen",
		" eighteen",
		" nineteen"
	};
	private static final String[] tensNames = {
		"",
		" ten",
		" twenty",
		" thirty",
		" forty",
		" fifty",
		" sixty",
		" seventy",
		" eighty",
		" ninety"
	};

	public String convertLessThanThousand(int number) throws NumberToWordFormatException{
		// TODO Auto-generated method stub
		String current;
		
		if (number % 100 < 20){
			current = numNames[number % 100];
			number /= 100;
		}
		else {
			current = numNames[number % 10];
			number /= 10;

			current = tensNames[number % 10] + current;
			number /= 10;
		}
		if (number == 0) return current;
		return numNames[number] + " hundred" + current;

	}

	public String convertAnyNumberToWords(int number) throws NumberToWordFormatException{
		// TODO Auto-generated method stub
		if(number<=0){
			throw new NumberToWordFormatException(number);
		}
		if(number>999999999){
			throw new NumberToWordFormatException(number);
		}
		
		String current = "";
		int place = 0;

		do {
			int n = number % 1000;
			if (n != 0){
				String s = convertLessThanThousand(n);
				current = s + specialNames[place] + current;
			}
			place++;
			number /= 1000;
		} while (number > 0);

		return ( current).trim();

	}

}
