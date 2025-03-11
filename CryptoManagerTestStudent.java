
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * This class represents Student test cases for a CryptoManager object.
 * 
 * @author Steven Shiblie
 * @version 3/10/2025
 * 
 */
public class CryptoManagerTestStudent {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testStringInBounds() {
		assertTrue(CryptoManager.isStringInBounds("JAVA"));
	}

	@Test
	public void testEncryptCaesar() {
		assertEquals("DEF", CryptoManager.caesarEncryption("ABC", 3));
		
	}

	@Test
	public void testDecryptCaesar() {
		assertEquals("ABC", CryptoManager.caesarDecryption("DEF", 3));
	}
	
	@Test
	public void testEncryptBellaso() {
		assertEquals("DOVGHSZ", CryptoManager.bellasoEncryption("ABCDEFG", "CMSC"));
		
	}

	@Test
	public void testDecryptBellaso() {
		assertEquals("ABCDEFG", CryptoManager.bellasoDecryption("DOVGHSZ", "CMSC"));
	}
}
