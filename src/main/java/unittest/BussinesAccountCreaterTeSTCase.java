package unittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import designpattern.templateMthode.BusinessAccountCreator;

class BussinesAccountCreaterTeSTCase {
	private BusinessAccountCreator ac ;
	@BeforeEach
	void setUp() throws Exception {
		ac = new BusinessAccountCreator();
	}


	@Test
	void test() {
		assertNotNull(ac);
	}

}
