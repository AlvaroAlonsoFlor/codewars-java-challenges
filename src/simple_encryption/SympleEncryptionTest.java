package simple_encryption;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SympleEncryptionTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@Test
	void noWordReturnsNull() {
		assertEquals(null, SympleEncryption.encrypt(null, 0));
	}
	
	@Test
	void nLessZeroReturnsText() {
		assertEquals("Yas!", SympleEncryption.encrypt("Yas!", 0));
	}
	
	@Test
	void encryptValidString() {
		assertEquals("hsi  etTi sats!", SympleEncryption.encrypt("This is a test!", 1));
		assertEquals("s eT ashi tist!", SympleEncryption.encrypt("This is a test!", 2));
	}
	
	@Test
	void decryptValidString() {
		assertEquals("This is a test!", SympleEncryption.decrypt("hsi  etTi sats!", 1));
	}
	

}
