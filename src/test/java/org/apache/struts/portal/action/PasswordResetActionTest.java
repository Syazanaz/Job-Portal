package org.apache.struts.portal.action;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Password Reset Action Test class: Once invoked runs the junit tests on password reset action.
 * @author Syazana
 *
 */
public class PasswordResetActionTest {
	
	PasswordResetAction resetPwd = new PasswordResetAction();

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
		resetPwd.setResEmail("");
	}

	@After
	public void tearDown() throws Exception {
	}
	
	/**
	 * Test Execute Method: testing message trigger if no email is provided to reset password action execution.
	 */
	@Test
	public void testExecute() {
		try {
			resetPwd.execute();
			String result = resetPwd.getResetMessage();
		assertEquals("Please enter the email address to send your password reset details", result);
		}catch (Exception e) {
		e.printStackTrace();
		}
	}

}
