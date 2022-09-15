package unittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import designpattern.templateMthode.PrivateAccountCreator;

class PrivateAccountCreaterTestCase {
private PrivateAccountCreator ac;
	@BeforeEach
	void setUp() throws Exception {
		ac=new PrivateAccountCreator ();
	}

	
	@Test
	void test() {
		assertNotNull(ac);
	}

}
