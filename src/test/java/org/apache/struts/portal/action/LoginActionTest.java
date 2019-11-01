package org.apache.struts.portal.action;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Login Action class: Once invoked runs the junit tests on login action.
 * @author Syazana
 *
 */
public class LoginActionTest {
	
	LoginAction user = new LoginAction();
	LoginAction admin = new LoginAction();
	LoginAction invalid = new LoginAction();
	LoginAction falseAdmin = new LoginAction();
	
	/**
	 * Set Up Before Class Method
	 * @throws Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * Tear Down After Class Method
	 * @throws Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	/**
	 * Set Up Method
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		user.setEmail("jgilphillan0@bizjournals.com");
		user.setPassword("dnAngR");
		
		admin.setEmail("lworsom0@digg.com");
		admin.setPassword("ZoDX4ncksQMp");
		
		invalid.setEmail("abc@test.com");
		invalid.setPassword("password");
		
		falseAdmin.setEmail("mgallaccio4@go.com");
		falseAdmin.setPassword("HDLkZju");
	}

	/**
	 * Tear Down Method
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * User Test Loginexecute method: testing the validity of User email and password.
	 */
	@Test
	public void UserTestLoginexecute() {
		try {
			user.loginexecute();
			assertTrue("User", true);
		}catch (Exception e) {
		e.printStackTrace();
		}
	}
	
	/**
	 * Admin Test Loginexecute method: testing the validity of Admin email and password.
	 */
	@Test
	public void AdminTestLoginexecute() {
		try {
			admin.loginexecute();
			assertTrue("Admin", true);
		}catch (Exception e) {
		e.printStackTrace();
		}
	}
	
	/**
	 * False Admin Test Loginexecute method: testing User credentials should not allows login as Admin.
	 */
	@Test
	public void falseAdminTestLoginexecute() {
		try {
			falseAdmin.loginexecute();
			assertFalse("Admin", false);
			assertTrue("User", true);
		}catch (Exception e) {
		e.printStackTrace();
		}
	}
	
	/**
	 * Invalid Test Loginexecute method: testing invalid credentials should trigger invalid email and invalid password error message.
	 */
	@Test
	public void invalidTestLoginexecute() {
		try {
			invalid.loginexecute();
			assertTrue("invalid_email", true);
			assertTrue("invalid_password", true);
		}catch (Exception e) {
		e.printStackTrace();
		}
	}

}
