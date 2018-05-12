/**
 * 
 */
package com.example.caesar.util;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Takuma Watanabe
 *
 */
public class CaesarCipherTest {

	/**
	 * Test method for {@link com.example.caesar.util.CaesarCipher#encrypt(int, java.lang.String)}.
	 * Tests encryptiuon of a message with shift of 10.
	 */
	@Test
	public void testEncryptWithShift10() {
		int shift = 10;
		String message = "Hello, world!";
		String expectedResultMessage = "Rovvy, gybvn!";
		String actualResultMessage = CaesarCipher.encrypt(shift, message);
		
		assertEquals(expectedResultMessage, actualResultMessage);
	}
	
	/**
	 * Test method for {@link com.example.caesar.util.CaesarCipher#encrypt(int, java.lang.String)}.
	 * Tests encryptiuon of a message with shift of 36.
	 */
	@Test
	public void testEncryptWithShift36() {
		int shift = 36;
		String message = "Hello, world!";
		String expectedResultMessage = "Rovvy, gybvn!";
		String actualResultMessage = CaesarCipher.encrypt(shift, message);
		
		assertEquals(expectedResultMessage, actualResultMessage);
	}
	
	/**
	 * Test method for {@link com.example.caesar.util.CaesarCipher#encrypt(int, java.lang.String)}.
	 * Tests encryptiuon of a message with shift of -16.
	 */
	@Test
	public void testEncryptWithShift_16() {
		int shift = -16;
		String message = "Hello, world!";
		String expectedResultMessage = "Rovvy, gybvn!";
		String actualResultMessage = CaesarCipher.encrypt(shift, message);
		
		assertEquals(expectedResultMessage, actualResultMessage);
	}

	/**
	 * Test method for {@link com.example.caesar.util.CaesarCipher#decrypt(int, java.lang.String)}.
	 * Tests decryption of a message with shift of 10.
	 */
	@Test
	public void testDecryptWithShift10() {
		int shift = 10;
		String message = "Rovvy, gybvn!";
		String expectedResultMessage = "Hello, world!";
		String actualResultMessage = CaesarCipher.decrypt(shift, message);
		
		assertEquals(expectedResultMessage, actualResultMessage);
	}
	
	/**
	 * Test method for {@link com.example.caesar.util.CaesarCipher#decrypt(int, java.lang.String)}.
	 * Tests decryption of a message with shift of 36.
	 */
	@Test
	public void testDecryptWithShift36() {
		int shift = 36;
		String message = "Rovvy, gybvn!";
		String expectedResultMessage = "Hello, world!";
		String actualResultMessage = CaesarCipher.decrypt(shift, message);
		
		assertEquals(expectedResultMessage, actualResultMessage);
	}
	
	/**
	 * Test method for {@link com.example.caesar.util.CaesarCipher#decrypt(int, java.lang.String)}.
	 * Tests decryption of a message with shift of -16.
	 */
	@Test
	public void testDecryptWithShift_16() {
		int shift = -16;
		String message = "Rovvy, gybvn!";
		String expectedResultMessage = "Hello, world!";
		String actualResultMessage = CaesarCipher.decrypt(shift, message);
		
		assertEquals(expectedResultMessage, actualResultMessage);
	}

}
