/*
 * 
 *  program to print the characters corresponding to ASCII codes from 65 to 90.
 * 
 * Expected Output : Print the characters corresponding to ASCII codes from 65 to 90 in a tabular format like:
 *					65-A
 *					66-B		
 * 
 */

package com.ascii;

public class AsciiCode {
	
	
	public static void main(String[] args) {
		
		char asciiValue;   
		
		for(int asciiCode =65; asciiCode < 91; asciiCode++){
			
			asciiValue = (char ) asciiCode;
			System.out.println( asciiCode + "-" + asciiValue);
			
		}

	}

}
