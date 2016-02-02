package de.drippinger.junitlambda;

import org.junit.gen5.api.Assertions;
import org.junit.gen5.api.DisplayName;
import org.junit.gen5.api.Test;

import static org.junit.gen5.api.Assertions.assertAll;
import static org.junit.gen5.api.Assertions.assertEquals;
import static org.junit.gen5.api.Assumptions.assumeTrue;

/**
 * JUnitTest
 *
 * @author Dennis Rippinger
 */
public class JUnitTest {

	@Test
	void myFirstTest() {
		assertEquals(2, 1 + 1);
	}

	@Test
	void groupedAssertions() {

		assertAll("address",
				() -> assertEquals("Dennis", "Other"),
				() -> assertEquals("User", "User")
		);

		Assertions.fail("test");
	}

	@Test
	@DisplayName("Aborting test")
	void assume() {
		assumeTrue(false, "Aborting");

		System.out.println("test");
	}
}