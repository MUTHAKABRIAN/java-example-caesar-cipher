/**
 * 
 */
package com.example.caesar.util;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test cases for {@link com.example.caesar.util.CaesarCipherCracker}.
 */
public class CaesarCipherCrackerTest {

	/**
	 * Test method for {@link com.example.caesar.util.CaesarCipherCracker#guessShift(java.lang.String)}.
	 * Tests with Hamlet shifted of 16.
	 */
	@Test
	public void testGuessShiftOnHamletWithShift16() {
		int shift = 16;
		String message = "To be, or not to be: that is the question:" +
				"Whether 'tis nobler in the mind to suffer" +
				"The slings and arrows of outrageous fortune," +
				"Or to take arms against a sea of troubles," +
				"And by opposing end them? To die: to sleep;" +
				"No more; and by a sleep to say we end" +
				"The heart-ache and the thousand natural shocks" +
				"That flesh is heir to, 'tis a consummation" +
				"Devoutly to be wish'd. To die, to sleep;" +
				"To sleep: perchance to dream: ay, there's the rub;" +
				"For in that sleep of death what dreams may come" +
				"When we have shuffled off this mortal coil," +
				"Must give us pause: there's the respect" +
				"That makes calamity of so long life;" +
				"For who would bear the whips and scorns of time," +
				"The oppressor's wrong, the proud man's contumely," +
				"The pangs of despised love, the law's delay," +
				"The insolence of office and the spurns" +
				"That patient merit of the unworthy takes," +
				"When he himself might his quietus make" +
				"With a bare bodkin? who would fardels bear," +
				"To grunt and sweat under a weary life," +
				"But that the dread of something after death," +
				"The undiscover'd country from whose bourn" +
				"No traveller returns, puzzles the will" +
				"And makes us rather bear those ills we have" +
				"Than fly to others that we know not of?" +
				"Thus conscience does make cowards of us all;" +
				"And thus the native hue of resolution" +
				"Is sicklied o'er with the pale cast of thought," +
				"And enterprises of great pith and moment" +
				"With this regard their currents turn awry," +
				"And lose the name of action.--Soft you now!" +
				"The fair Ophelia! Nymph, in thy orisons" +
				"Be all my sins remember'd.";
		
		String shiftedMessage = CaesarCipher.encrypt(16, message);
		
		int guessedShift = CaesarCipherCracker.guessShift(shiftedMessage);
		
		assertEquals(shift, guessedShift);
		
	}
	
	/**
	 * Test method for {@link com.example.caesar.util.CaesarCipherCracker#guessShift(java.lang.String)}.
	 * Tests with Harry Potter shifted of 16.
	 */
	@Test
	public void testGuessShiftOnHarryPotterWithShift16() {
		int shift = 16;
		String message = "\"We bow to each other. Harry,\" said Voldemort, bending a little, "+
		"but keeping his snakelike face upturned to Harry. \"Come, the niceties must be observed. . . . "+
				"Dumbledore would like you to show manners. . . . Bow to death, Harry. . . . \"" +
				"The Death Eaters were laughing again. Voldemort's lipless mouth was smiling. "+
				"Harry did not bow. He was not going to let Voldemort play with him before killing him. . . "+
				"he was not going to give him that satisfaction. . . . \"I said, bow,\" Voldemort said, raising his wand - " +
				"and Harry felt his spine curve as though a huge, invisible hand were bending him ruthlessly forward,"+
				"and the Death Eaters laughed harder than ever. " +
				"\"Very good,\" said Voldemort softly, and as he raised his wand the pressure bearing down upon Harry lifted too. "+
				"\"And now you face me, like a man. . . straight-backed and proud, the way your father died. . . . " +
				"\"And now - we duel. \"";
		
		String shiftedMessage = CaesarCipher.encrypt(16, message);
		
		int guessedShift = CaesarCipherCracker.guessShift(shiftedMessage);
		
		assertEquals(shift, guessedShift);
		
	}

}
