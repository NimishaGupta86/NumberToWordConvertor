package com.numberToWordConvertor.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.numberToWordConvertor.Interface.ConvertNumberToWords;
import com.numberToWordConvertor.Service.ConvertNumberToWordsService;
import com.numberToWordConvertor.customException.NumberToWordFormatException;

public class NumberToWordConvertorMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Number to convert into words: ");
        Scanner sc = new Scanner(System.in);

        try {
        	if(sc.findInLine(",")!=null){
        		throw new NumberToWordFormatException(sc.nextInt());
        	}
            int num = sc.nextInt();

            ConvertNumberToWords convertNbrToWord = new ConvertNumberToWordsService();
            convertNbrToWord.convertAnyNumberToWords(num);

        }catch(InputMismatchException ime){
            System.out.println("Please enter valid Number "+"Exception Occured: "+ime);

        }catch(NumberToWordFormatException nfe){
        	System.out.print(nfe.toString());
        }
	}

}
