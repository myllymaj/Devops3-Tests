package tester.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AppTest {
	
	App myapp;
	@Before
	public void setUp() throws Exception {
		myapp = new App();
	}

	@After
	public void tearDown() throws Exception {
		myapp = null;
	}

	@Test
	public void testMain() {
		int result = myapp.addition(500,300);
		assertTrue(result == 800);
	}

}
