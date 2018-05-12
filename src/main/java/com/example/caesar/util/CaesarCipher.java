/**
 * 
 */
package com.example.caesar.util;

/**
 * Caesar Cipher utility Class.
 */
public class CaesarCipher {
	public static final int ALPHABET_SIZE = 'Z' - 'A' + 1;
	
	/**
	 * Encrypt given message using Caesar Cipher.
	 * 
	 * @param shift Number to shift message of.
	 * @param message Message to encrypt.
	 * @return Encrypted message.
	 */
	public static String encrypt(int shift, String message) {
		return shift(shift, message);
	}

	/**
	 * Decrypt given message using Caesar Cipher.
	 * 
	 * @param shift Number to shift message of.
	 * @param message Message to decrypt.
	 * @return Decrypted message.
	 */
	public static String decrypt(int shift, String message) {
		return shift(-shift, message);
	}
	
	protected static String shift(int shift, String message) {
		char[] messageCharArray = message.toCharArray();
		shift = shift % ALPHABET_SIZE;
		if (shift < 0) {
			shift += ALPHABET_SIZE;
		}
		
		for (int i = 0; i < messageCharArray.length; ++i) {
			char c = messageCharArray[i];
			
			if ('A' <= c && c <= 'Z') {
				// Alphabetical characters (upper cases) should be shifted.
				c = (char) (c + shift);
				if (!('A' <= c && c <= 'Z')) {
					c = (char) (c - ALPHABET_SIZE);
				}
			} else if ('a' <= c && c <= 'z') {
				// Alphabetical characters (lower cases) should be shifted.
				c = (char) (c + shift);
				if (!('a' <= c && c <= 'z')) {
					c = (char) (c - ALPHABET_SIZE);
				}
			} else {
				// Non-alphabetical characters should be ignored.
				// Do nothing.
			}
			
			messageCharArray[i] = c;
		}

		return String.valueOf(messageCharArray);
	}
}
