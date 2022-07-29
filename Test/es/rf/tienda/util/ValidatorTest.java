import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import es.rf.tienda.util.Validator;

class ValidatorTest {

	@Test
	void testIsAlfanumeric() {
		assertTrue(Validator.cumpleLongitud("pepe", 2, 10));
	}

	@Test
	void testIsVacio() {
		fail("Not yet implemented");
	}

	@Test
	void testCumplePhoneNumber() {
		fail("Not yet implemented");
	}

	@Test
	void testIsEmailValido() {
		fail("Not yet implemented");
	}

	@Test
	void testCumpleDNI() {
		fail("Not yet implemented");
	}

	@Test
	void testCumpleRangoIntIntInt() {
		fail("Not yet implemented");
	}

	@Test
	void testCumpleRangoDoubleIntInt() {
		fail("Not yet implemented");
	}

	@Test
	void testCumpleLongitudMin() {
		fail("Not yet implemented");
	}

	@Test
	void testCumpleLongitudMax() {
		fail("Not yet implemented");
	}

	@Test
	void testCumpleLongitud() {
		fail("Not yet implemented");
	}

	@Test
	void testValDateMin() {
		fail("Not yet implemented");
	}

	@Test
	void testValDateMax() {
		fail("Not yet implemented");
	}

	@Test
	void testEsFechaValida() {
		fail("Not yet implemented");
	}

	@Test
	void testEsPasswordValida() {
		fail("Not yet implemented");
	}

}
