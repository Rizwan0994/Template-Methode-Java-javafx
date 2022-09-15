package unittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import designpattern.templateMthode.App;

class AppTestCase {
	private App app;
	@BeforeEach
	void setUp() throws Exception {
		app=new App();
		}

	
	@Test
	void test() {
		assertNotNull(app);
			
	}

}
