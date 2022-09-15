package unittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import designpattern.templateMthode.PrivateAccountCreator;

class PrivateAccountCreaterTestCase2 {
	 PrivateAccountCreator ac;
	@BeforeEach
	void setUp() throws Exception {
		ac=new  PrivateAccountCreator ();
	}

	@Test
	@DisplayName("check AccountNumberGerate True")
	void test() {
		String s="Private Account Number Generated!";
		assertEquals(ac.generateAccountNumber(),s);
		
	}
	@Test
	@DisplayName("check AccountNumberGerate False")
	void test1() {
		String s="Verify Account details!!";
		
		assertNotEquals(ac.generateAccountNumber(),s);
		
	}

}
