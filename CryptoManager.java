/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description:  Create a program that encrypts and decrypts a phrase using two approaches, Caesar Cipher and Bellaso method.
 * Due: 3/10/25
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming  assignment independently. 
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Steven Shiblie
*/

/**
 * This is a utility class that encrypts and decrypts a phrase using two
 * different approaches. The first approach is called the Caesar Cipher and is a
 * simple �substitution cipher� where characters in a message are replaced by a
 * substitute character. The second approach, due to Giovan Battista Bellaso,
 * uses a key word, where each character in the word specifies the offset for
 * the corresponding character in the message, with the key word wrapping around
 * as needed.
 * 
 * @author Farnaz Eivazi
 * @version 7/16/2022
 */
public class CryptoManager {
	
	private static final char LOWER_RANGE = ' ';
	private static final char UPPER_RANGE = '_';
	private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_RANGE and UPPER_RANGE characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean isStringInBounds (String plainText) {
		for(int i = 0; i < plainText.length(); i++) {
			if(plainText.charAt(i) > UPPER_RANGE || plainText.charAt(i) < LOWER_RANGE)
				return false;
		}
		return true;
		
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String caesarEncryption(String plainText, int key) {
		if(!isStringInBounds(plainText))
			return "The selected string is not in bounds, Try again.";
		
		String encryptString = "";
		while(key > RANGE)
			key -= RANGE;
		for(int i = 0; i < plainText.length(); i++)
		{
			char encryptChar = (char) (((plainText.charAt(i) - LOWER_RANGE + key) % RANGE) + LOWER_RANGE);
			encryptString += encryptChar;
		}
		return encryptString;
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher. Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String bellasoEncryption (String plainText, String bellasoStr) {
		if(!isStringInBounds(plainText))
			return "The selected string is not in bounds, Try again.";
		
		String encryptString = "";
		for(int i = 0; i < plainText.length(); i++) {
			char bellasoChar = bellasoStr.charAt(i % bellasoStr.length());
			char encryptChar = (char) (((plainText.charAt(i) - LOWER_RANGE + bellasoChar) % RANGE) + LOWER_RANGE);
			encryptString += encryptChar;
		}
		return encryptString;
	}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String caesarDecryption (String encryptedText, int key) {
		String unEncryptString = "";
		while(key > RANGE)
			key -= RANGE;
		for(int i = 0; i < encryptedText.length(); i++)
		{
			char deCryptChar = (char) (((encryptedText.charAt(i) - LOWER_RANGE - key + RANGE) % RANGE) + LOWER_RANGE);
			unEncryptString += deCryptChar;
		}
		return unEncryptString;
	}
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String bellasoDecryption(String encryptedText, String bellasoStr) {
		String unEncryptString = "";
		for(int i = 0; i < encryptedText.length(); i++) {
			char bellasoChar = bellasoStr.charAt(i % bellasoStr.length());
			int deCryptChar = (encryptedText.charAt(i) - bellasoChar);
			
			while(deCryptChar < LOWER_RANGE)
				deCryptChar += RANGE;
			
			unEncryptString += (char) deCryptChar;
		}
		return unEncryptString;
	}
}
