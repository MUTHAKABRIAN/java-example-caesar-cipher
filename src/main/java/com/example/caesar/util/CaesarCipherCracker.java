/**
 * 
 */
package com.example.caesar.util;

/**
 * Caesar Cipher Cracker Class.
 */
public class CaesarCipherCracker {
	// See https://en.wikipedia.org/wiki/Letter_frequency.
	protected static final double[] alphabetFrequencies = { 0.08167, 0.01492, 0.02782, 0.04253, 0.12702, 0.02228,
			0.02015, 0.06094, 0.06966, 0.00153, 0.00772, 0.04025, 0.02406, 0.06749, 0.07507, 0.01929, 0.00095, 0.05987,
			0.06327, 0.09056, 0.02758, 0.00978, 0.02360, 0.00150, 0.01974, 0.00074 };

	/**
	 * Cracks Caesar Cipher message.
	 * 
	 * @param message Cipher message.
	 * @return Guessed shift number of given cipher message.
	 */
	public static int guessShift(String message) {
		char[] messageCharArray = message.toCharArray();
		double[] alphabetFrequencies = calculateAlphabetFrequencies(messageCharArray);
		
		// calculate inner product with each shifts
		double[] innerProductWithEachShifts = new double[26];
		for (int currentShift = 0; currentShift < CaesarCipher.ALPHABET_SIZE; ++currentShift) {
			double innerProduct = 0.0;
			
			for (int i = 0; i < CaesarCipher.ALPHABET_SIZE; ++i) {
				double expectedFrequencyI = CaesarCipherCracker.alphabetFrequencies[i];
				double actualFrequencyI = alphabetFrequencies[(i + currentShift) % CaesarCipher.ALPHABET_SIZE];
				
				innerProduct += expectedFrequencyI * actualFrequencyI;
			}
			
			innerProductWithEachShifts[currentShift] = innerProduct;
		}
		
		int largestIndex = 0;
		double largestValue = 0.0;
		for (int i = 0; i < innerProductWithEachShifts.length; ++i) {
			if (innerProductWithEachShifts[i] > largestValue) {
				largestIndex = i;
				largestValue = innerProductWithEachShifts[i];
			}
		}
		
		return largestIndex;
	}

	/**
	 * Calculate Alphabet frequencies of given message.
	 * 
	 * @param characters message.
	 * @return Alphabet frequencies of given message.
	 */
	protected static double[] calculateAlphabetFrequencies(char[] characters) {
		int[] alphabetOccurences = new int[CaesarCipher.ALPHABET_SIZE];

		for (int i = 0; i < characters.length; ++i) {
			char c = characters[i];

			if ('A' <= c && c <= 'Z') {
				c -= 'A';
			} else if ('a' <= c && c <= 'z') {
				c -= 'a';
			} else {
				continue;
			}

			alphabetOccurences[c]++;
		}

		int totalNumberOfAlphabets = 0;
		for (int i = 0; i < CaesarCipher.ALPHABET_SIZE; ++i) {
			totalNumberOfAlphabets += alphabetOccurences[i];
		}

		double[] alphabetFrequencies = new double[CaesarCipher.ALPHABET_SIZE];
		for (int i = 0; i < CaesarCipher.ALPHABET_SIZE; ++i) {
			alphabetFrequencies[i] = (double) alphabetOccurences[i] / totalNumberOfAlphabets;
		}

		return alphabetFrequencies;
	}
}
