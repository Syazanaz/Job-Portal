package org.apache.struts.portal.action;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Register Action Test Class: Once invoked runs all the junit Register Action Class tests.
 * @author Syazana
 *
 */
public class RegisterActionTest {
	
	RegisterAction register = new RegisterAction();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	/**
	 * Set Up Method 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		register.getPerson_id( );
		register.setFirstname("");
		register.setLastname("");
		register.setEmail("");
		register.setPassword("");
		register.setCompany_name("");
		register.setCity("");
		register.setCountry("");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void registerFailTestExecute() {
		try {
			register.execute();
			assertFalse("SUCCESS", false);
		}catch (Exception e) {
		e.printStackTrace();
		}
	}
}
